package RentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    public static List<MovieItem> currentlyMovieList;
    public static List<MovieItem> rentalMovieList;
    public static List<MovieItem> soldMovieList;


    public Movies() {
        currentlyMovieList = new ArrayList<>();
        rentalMovieList = new ArrayList<>();
        soldMovieList = new ArrayList<>();
    }

    public void movieAdd(MovieItem item) {
        currentlyMovieList.add(item);
    }

    public void rentalMovie(int movieId, Customer customer) {
        MovieItem movie = null;
        for (MovieItem item : currentlyMovieList) {
            if (item.id == movieId) {
                movie = item;
            }


        }
        if (customer instanceof SubscribedCustomer) {
            ((SubscribedCustomer) customer).setMovieItem(movie);
          if(customer.personalCredit >= movie.creditAmount){
              currentlyMovieList.remove(movie);
              rentalMovieList.add(movie);
              movie.setOwner(customer);
              System.out.println("Hi '"+ customer.name + " ' Thanks for rental");
          }else{
              System.out.println("Sorry.'"+ customer.name +"' Personal credit not enough");
              System.out.println("your credit : " + customer.personalCredit);
              System.out.println("movie credit : " + movie.creditAmount);
          }


        } else if (customer instanceof StandardCustomer) {
            System.out.println("Sorry! '"+ customer.name+"'");
            System.out.println("only Subscribed customer can rent movie");
        }

    }

    public void sellMovie(int movieId, Customer customer) {
        MovieItem movie = null;
        for (MovieItem item : currentlyMovieList) {
            if (item.id == movieId) {
                movie = item;
            }

        }
        if( customer.personalCredit >= movie.creditAmount){
            currentlyMovieList.remove(movie);
            soldMovieList.add(movie);
            System.out.println("Hi '"+ customer.name + " ' Thanks for buy");

            if (customer instanceof SubscribedCustomer) {
                ((SubscribedCustomer) customer).setMovieItem(movie);
                movie.setOwner(customer);

            } else if (customer instanceof StandardCustomer) {
                ((StandardCustomer) customer).setMovieItem(movie);
                movie.setOwner(customer);
            }

        }else{
            System.out.println("Sorry.'"+ customer.name +"' Personal credit not enough");
            System.out.println("your credit : " + customer.personalCredit);
            System.out.println("movie credit : " + movie.creditAmount);
        }

    }

}

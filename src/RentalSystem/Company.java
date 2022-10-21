package RentalSystem;

public class Company {
    public String name = "Movie Company";
    public Movies movies;


    public Company(Movies movies) {
        this.movies = movies;
    }



    public  void printInfoAllList(){
        System.out.println("----- ALL MOVIES------");
        for (MovieItem movie : movies.currentlyMovieList) {
            System.out.println("movie name :" + movie.name +
                    " - movie id : " + movie.id +
                    " - movie credit : " + movie.creditAmount);
        }
        System.out.println("-----------");
    }
    public void printInfoRentList(){
        System.out.println("!!!! Rental List !!!!!");
        for (MovieItem movie : movies.rentalMovieList) {
            System.out.println("movie name :" + movie.name +
                    " - movie id : " + movie.id +
                    " - movie credit : " + movie.creditAmount +
                    " - movie owner : " + movie.owner.name);
        }
        System.out.println("------------------");

    }
    public void printInfoSoldList(){
        System.out.println("!!!! Sold List !!!!!");
        for (MovieItem movie : movies.soldMovieList) {
            System.out.println("movie name :" + movie.name +
                    " - movie id : " + movie.id +
                    " - movie credit : " + movie.creditAmount +
                    " - movie owner : " + movie.owner.name);
        }
        System.out.println("------------------");
    }
}

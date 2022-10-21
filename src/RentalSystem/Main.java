package RentalSystem;

public class Main {
    public static void main(String[] args) {

        Movies movies = new Movies();
        Company company = new Company(movies);

        MovieItem movie1 = new MovieItem("yuzuklerin efendisi",5,150);
        MovieItem movie2 = new MovieItem("görevimiz tehlike", 3,230);
        MovieItem movie3 = new MovieItem("harry potter",8,200);
        movies.movieAdd(movie1);
        movies.movieAdd(movie2);
        movies.movieAdd(movie3);

        company.printInfoAllList();


        SubscribedCustomer customer1 = new SubscribedCustomer("kemal",10,321);
        customer1.setPersonalCredit(150);
        movies.rentalMovie(5,customer1);


        company.printInfoRentList();



        StandardCustomer customer2 = new StandardCustomer("mehmet",3);
        movies.sellMovie(8,customer2);
        company.printInfoSoldList();

        company.printInfoAllList();

        movies.rentalMovie(3,customer2);



    }
}

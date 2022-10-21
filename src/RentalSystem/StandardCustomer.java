package RentalSystem;

public class StandardCustomer extends Customer{

    public MovieItem movieItem;

    public StandardCustomer(String name, int id) {
        super(name, id);
    }

    public void setMovieItem(MovieItem movieItem) {
        this.movieItem = movieItem;
    }
}

package RentalSystem;

public class SubscribedCustomer extends Customer {

    public int subscribedNo;

    public MovieItem movieItem;

    public SubscribedCustomer(String name, int id, int subscribedNo) {
        super(name, id);
        this.subscribedNo = subscribedNo;
    }

    public void setMovieItem(MovieItem movieItem) {
        this.movieItem = movieItem;
    }
}

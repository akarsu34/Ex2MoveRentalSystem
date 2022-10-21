package RentalSystem;

public class MovieItem {
    public String name;
    public int id;
    public double creditAmount;

    public Customer owner;

    public MovieItem(String name, int id, double creditAmount) {
        this.name = name;
        this.id = id;
        this.creditAmount = creditAmount;

    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}

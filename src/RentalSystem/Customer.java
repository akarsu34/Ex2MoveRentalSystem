package RentalSystem;

public class Customer {
    public String name;
    public int id;
    public int personalCredit;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        personalCredit=0;
    }

    public void setPersonalCredit(int credit) {
        this.personalCredit += credit;
    }
}

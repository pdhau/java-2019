package collection.section1.lecture61;

public class Transaction {

    private Customer customer;
    private double money;

    public Transaction() {
    }

    public Transaction(Customer customer, double money) {
        this.customer = customer;
        this.money = money;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getMoney() {
        return money;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

package collection.section1.lecture61;

import java.util.List;

public class Customer {

    private String name;
    private List<Double> doubles;
    private List<Transaction> transactions;

    public Customer() {
    }

    public Customer(String name, List<Double> doubles) {
        this.name = name;
        this.doubles = doubles;
    }

    public Customer(String name, List<Double> doubles, List<Transaction> transactions) {
        this(name, doubles);
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public List<Double> getDoubles() {
        return doubles;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoubles(List<Double> doubles) {
        this.doubles = doubles;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}

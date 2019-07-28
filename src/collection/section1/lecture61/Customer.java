package collection.section1.lecture61;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private double money;
    private List<Double> transactions;

    public Customer() {
        this.transactions = new ArrayList<>();
    }

    public Customer(String name, double money) {
        this();
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setTransactions(List<Double> transactions) {
        this.transactions = transactions;
    }

    public String toString() {
        return "Name: " + this.getName() + " -- Money: " + this.getMoney();
    }
}

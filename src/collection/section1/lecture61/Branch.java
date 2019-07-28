package collection.section1.lecture61;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private String name;
    private List<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public Branch(String name, List<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public boolean addCustomer(Customer customer) {
        List<Customer> customers = this.getCustomers();
        int customerIndex = customers.indexOf(customer);
        if (-1 != customerIndex) {
            return false;
        }
        return customers.add(customer);
    }

    public Customer findCustomerByName(String name) {
        return this.getCustomers().stream().filter(customer -> customer.getName().equals(name)).findFirst().orElse(null);
    }
}

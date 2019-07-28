package collection.section1.lecture61;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bank abc = new Bank();
        Branch phunhuan = new Branch("phunhuan");
        List<Double> doubles = new ArrayList<Double>();
        doubles.add(Double.parseDouble("1000"));
        doubles.add(Double.parseDouble("2000"));
        Customer haupham = new Customer("haupham", doubles);
        Transaction trs = new Transaction();
        trs.setCustomer(haupham);
        trs.setMoney(500);
        abc.addBranch(phunhuan);
        abc.addCustomer(phunhuan, haupham);
        phunhuan = abc.getBranches().get(abc.getBranches().indexOf(phunhuan));
        phunhuan.findCustomerByName("haupham");
    }
}

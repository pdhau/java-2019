package collection.section1.lecture61;

public class Main {

    public static void main(String[] args) {
        Bank abc = new Bank();
        Branch phunhuan = new Branch("phunhuan");
        Branch quan3 = new Branch("quan3");
        Customer haupham = new Customer("haupham", 3000);
        Customer thunguyen = new Customer("thunguyen", 5000);
        Customer anpham = new Customer("anpham", 5000);
        abc.addBranch(phunhuan);
        abc.addBranch(quan3);
        abc.addCustomer(phunhuan, haupham);
        abc.addCustomer(phunhuan, thunguyen);
        abc.addCustomer(quan3, anpham);
        System.out.println(abc.getBranches().get(0).getCustomers().get(1));
    }
}

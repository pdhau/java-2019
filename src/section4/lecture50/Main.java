package section4.lecture50;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("rollTypes", "pig", 100);
        hamburger.addHamburgerAddition(new Lettuce());
        hamburger.addHamburgerAddition(new Tomato());
        System.out.println(hamburger.calculatePrice());
    }
}

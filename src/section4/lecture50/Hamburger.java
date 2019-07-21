package section4.lecture50;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    List<IHamburgerAddition> hamburgerAdditions;
    String rollTypes;
    String meat;
    double basePrice;

    public Hamburger(String rollTypes, String meat, double basePrice){
        this.rollTypes = rollTypes;
        this.meat = meat;
        this.basePrice = basePrice;
        this.hamburgerAdditions = new ArrayList<IHamburgerAddition>();
    }

    public void addHamburgerAddition(IHamburgerAddition hamburgerAddition) {
        this.hamburgerAdditions.add(hamburgerAddition);
    }

    public double calculatePrice() {
        double price = 0;
        for (IHamburgerAddition hamburgerAddition : this.hamburgerAdditions) {
            price += hamburgerAddition.getPrice();
        }
        return this.basePrice + price;
    }
}

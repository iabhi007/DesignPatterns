package abhi.design.pattern.decorator.impl.coffee;

import abhi.design.pattern.decorator.iface.Coffee;

/**
 * Concrete Coffee class
 */
public class DarkRoastCoffee extends Coffee {

    public DarkRoastCoffee() {
        this.name = "Dark Roast Coffee";
    }

    @Override
    public Double cost() {
        return 4.95;
    }
}

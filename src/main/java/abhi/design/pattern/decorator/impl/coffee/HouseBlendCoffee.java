package abhi.design.pattern.decorator.impl.coffee;

import abhi.design.pattern.decorator.iface.Coffee;

public class HouseBlendCoffee extends Coffee {

    public HouseBlendCoffee() {
        this.name = "House Blend Coffee";
    }
    @Override
    public Double cost() {
        return 3.95;
    }

}

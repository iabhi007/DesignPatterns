package abhi.design.pattern.decorator.impl.condiments;

import abhi.design.pattern.decorator.iface.Coffee;
import abhi.design.pattern.decorator.iface.CoffeeCondiment;

public class SoyMilkCondiment extends CoffeeCondiment {

    public SoyMilkCondiment(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double cost() {
        return coffee.cost() + 1.99;
    }

    @Override
    public String name() {
        return this.coffee.name() + ":Soya Milk";
    }
}

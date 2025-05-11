package abhi.design.pattern.decorator.impl.condiments;

import abhi.design.pattern.decorator.iface.Coffee;
import abhi.design.pattern.decorator.iface.CoffeeCondiment;

public class MilkCondiment extends CoffeeCondiment {

    public MilkCondiment(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String name() {
        return coffee.name() +":Milk";
    }

    @Override
    public Double cost() {
        return 2.50 + coffee.cost();
    }
}

package abhi.design.pattern.decorator.impl.condiments;

import abhi.design.pattern.decorator.iface.Coffee;
import abhi.design.pattern.decorator.iface.CoffeeCondiment;

public class ChocolateCondiment extends CoffeeCondiment {

    //Constructor which takes a coffee instance.
    public ChocolateCondiment(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String name() {
        return coffee.name() + ":Chocolate";
    }

    @Override
    public Double cost() {
        return 1.20 + coffee.cost();
    }
}

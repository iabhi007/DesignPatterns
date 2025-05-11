package abhi.design.pattern.decorator.impl.condiments;

import abhi.design.pattern.decorator.iface.Coffee;
import abhi.design.pattern.decorator.iface.CoffeeCondiment;

public class SugarCondiment extends CoffeeCondiment {

    public SugarCondiment(Coffee coffee) {
        this.coffee =  coffee;
    }

    @Override
    public String name() {
        return coffee.name() +":Sugar";
    }

    @Override
    public Double cost() {
        return 1.00 + coffee.cost();
    }
}

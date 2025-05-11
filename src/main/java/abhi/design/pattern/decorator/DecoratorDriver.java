package abhi.design.pattern.decorator;

import abhi.design.pattern.decorator.iface.Coffee;
import abhi.design.pattern.decorator.impl.WordProcessor;
import abhi.design.pattern.decorator.impl.coffee.DarkRoastCoffee;
import abhi.design.pattern.decorator.impl.coffee.HouseBlendCoffee;
import abhi.design.pattern.decorator.impl.condiments.ChocolateCondiment;
import abhi.design.pattern.decorator.impl.condiments.MilkCondiment;
import abhi.design.pattern.decorator.impl.condiments.SoyMilkCondiment;
import abhi.design.pattern.decorator.impl.condiments.SugarCondiment;

public class DecoratorDriver {

    public static void main(String[] args) {
        Coffee darkRoastCoffee = new DarkRoastCoffee();
        darkRoastCoffee = new MilkCondiment(darkRoastCoffee);
        darkRoastCoffee = new ChocolateCondiment(darkRoastCoffee);
        darkRoastCoffee = new SugarCondiment(darkRoastCoffee);
        darkRoastCoffee = new ChocolateCondiment(darkRoastCoffee);
        darkRoastCoffee = new SoyMilkCondiment(darkRoastCoffee);
        darkRoastCoffee = new SoyMilkCondiment(darkRoastCoffee);
        darkRoastCoffee = new ChocolateCondiment(darkRoastCoffee);
        // this below decorator process the name along with cost
        darkRoastCoffee = new WordProcessor(darkRoastCoffee);

        System.out.println(darkRoastCoffee.name());

        // Similarity for house blend
        Coffee houseBlendCoffee = new HouseBlendCoffee();
        houseBlendCoffee = new ChocolateCondiment(houseBlendCoffee);
        houseBlendCoffee = new SoyMilkCondiment(houseBlendCoffee);
        houseBlendCoffee = new SoyMilkCondiment(houseBlendCoffee);
        houseBlendCoffee = new WordProcessor(houseBlendCoffee);
        System.out.println(houseBlendCoffee.name());
    }
}

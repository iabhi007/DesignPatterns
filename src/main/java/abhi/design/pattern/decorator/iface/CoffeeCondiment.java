package abhi.design.pattern.decorator.iface;

/**
 * This is the component decorator which wraps
 * the components and add a new behavior.
 */
public abstract class CoffeeCondiment extends Coffee {
    protected Coffee coffee;

    // this will be used by condiment to print the condiment name
    public abstract String name();
}

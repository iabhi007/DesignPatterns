package abhi.design.pattern.decorator.iface;

/**
 * This is standard Component which would be decorated
 */
public abstract class Coffee {
    protected String name = "Generic Coffee";

    // this method will be used to print the name
    public String name() {
        return name;
    }

    public abstract Double cost();

}

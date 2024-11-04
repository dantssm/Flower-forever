package ua.edu.ucu.apps.lab8.decorators;

public class RibbonDecorator extends AbstractDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 40 + super.price();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with a Ribbon";
    }
}

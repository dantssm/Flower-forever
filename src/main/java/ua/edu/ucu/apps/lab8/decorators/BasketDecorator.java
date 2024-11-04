package ua.edu.ucu.apps.lab8.decorators;

public class BasketDecorator extends AbstractDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 4 + super.price();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in a Basket";
    }
}


package ua.edu.ucu.apps.lab8.decorators;

public abstract class AbstractDecorator extends Item {
    protected Item item;

    public AbstractDecorator(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return item.price();
    }
}
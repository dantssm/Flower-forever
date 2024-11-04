package ua.edu.ucu.apps.lab8.decorators;

public class PaperDecorator extends AbstractDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 13 + super.price();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Paper Decoration";
    }
}


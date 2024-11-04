package ua.edu.ucu.apps.lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab8.decorators.BasketDecorator;
import ua.edu.ucu.apps.lab8.decorators.Item;
import ua.edu.ucu.apps.lab8.decorators.PaperDecorator;
import ua.edu.ucu.apps.lab8.decorators.RibbonDecorator;
import ua.edu.ucu.apps.lab8.model.Flower;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    private Flower flower;

    @BeforeEach
    public void setUp() {
        flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(10);
        flower.setColor("Red");

        System.out.println("Flower initialized: " + flower);
    }

    @Test
    public void testPaperDecoratorPriceAndDescription() {
        Item paperDecoratedFlower = new PaperDecorator(flower);

        assertEquals(23, paperDecoratedFlower.price(), 0.01);

        assertEquals("Red Rose with Paper Decoration", paperDecoratedFlower.getDescription());
    }

    @Test
    public void testBasketDecoratorPriceAndDescription() {
        Item basketDecoratedFlower = new BasketDecorator(flower);

        assertEquals(14, basketDecoratedFlower.price(), 0.01);
        assertEquals("Red Rose in a Basket", basketDecoratedFlower.getDescription());
    }

    @Test
    public void testRibbonDecoratorPriceAndDescription() {
        Item ribbonDecoratedFlower = new RibbonDecorator(flower);

        assertEquals(50, ribbonDecoratedFlower.price(), 0.01);
        assertEquals("Red Rose with a Ribbon", ribbonDecoratedFlower.getDescription());
    }

    @Test
    public void testMultipleDecoratorsPriceAndDescription() {
        Item fullyDecoratedFlower = new RibbonDecorator(new BasketDecorator(new PaperDecorator(flower)));

        assertEquals(67, fullyDecoratedFlower.price(), 0.01);
        assertEquals("Red Rose with Paper Decoration in a Basket with a Ribbon", fullyDecoratedFlower.getDescription());
    }
}



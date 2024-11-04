package ua.edu.ucu.apps.lab8.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab8.decorators.Item;

@Setter
@Getter
@Entity
@Table(name = "flowers")
public class Flower extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String color;
    private double price;
    private boolean available;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return color + " " + name;
    }
}

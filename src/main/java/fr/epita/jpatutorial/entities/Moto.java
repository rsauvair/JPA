package fr.epita.jpatutorial.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String model;
    private int numberOfCylinders;

    public Moto() { }

    public Moto(String brand, String model, int numberOfCylinders) {
        this.brand = brand;
        this.model = model;
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %dcc", brand, model, numberOfCylinders);
    }
}








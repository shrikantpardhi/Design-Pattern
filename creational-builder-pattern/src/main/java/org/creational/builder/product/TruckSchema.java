package org.creational.builder.product;

public class TruckSchema {
    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;


    public TruckSchema(int id, int height, String brand, String model, String color, String engine, int nbrOfDoors) {
        this.id = id;
        this.height = height;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.nbrOfDoors = nbrOfDoors;
    }
}

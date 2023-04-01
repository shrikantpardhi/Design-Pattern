package org.creational.builder.builder;

import org.creational.builder.product.Truck;

public class TruckBuilder implements Builder{

    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    @Override
    public Builder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Builder height(int height) {
        this.height = height;
        return this;
    }

    @Override
    public Builder engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public Truck build() {
        return  new Truck(id, height, brand, model, color, engine, nbrOfDoors);
    }

    @Override
    public String toString() {
        return "TruckBuilder{" +
                "id=" + id +
                ", height=" + height +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", nbrOfDoors=" + nbrOfDoors +
                '}';
    }
}

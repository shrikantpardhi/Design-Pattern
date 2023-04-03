package org.creational.prototype.pattern;

public abstract class Animal {
    private int legs;
    private String name;
    private String color;
    private boolean canRun;

    public Animal(int legs, String name, String color, boolean canRun) {
        this.legs = legs;
        this.name = name;
        this.color = color;
        this.canRun = canRun;
    }

    protected Animal(Animal animal) {
        this.legs = animal.legs;
        this.name = animal.name;
        this.color = animal.color;
        this.canRun = animal.canRun;
    }

    public abstract Animal clone();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}

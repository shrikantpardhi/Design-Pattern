package org.creational.prototype.pattern;

public class Cow extends Animal{
    private String type;

    public Cow(int legs, String name, String color, boolean canRun, String type) {
        super(legs, name, color, canRun);
        this.type = type;
    }

    public Cow(Cow cow) {
        super(cow);
        this.type = cow.type;
    }

    @Override
    public Animal clone() {
        return new Cow(this);
    }
}

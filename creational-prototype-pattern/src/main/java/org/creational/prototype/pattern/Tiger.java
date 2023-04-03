package org.creational.prototype.pattern;

public class Tiger extends Animal{
    private String type;

    public Tiger(int legs, String name, String color, boolean canRun, String type) {
        super(legs, name, color, canRun);
        this.type = type;
    }

    public Tiger(Tiger tiger) {
        super(tiger);
        this.type = tiger.type;
    }

    @Override
    public Animal clone() {
        return new Tiger(this);
    }

}

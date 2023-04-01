package org.creational.builder.builder;

public class Director {
    public void buildTata(Builder builder) {
        builder.brand("Tata")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildMahindra(Builder builder) {
        builder.brand("Mahindra")
                .model("XL100")
                .color("Yellow")
                .height(120);
    }
}

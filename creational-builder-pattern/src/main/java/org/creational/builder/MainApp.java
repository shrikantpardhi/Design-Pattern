package org.creational.builder;

import org.creational.builder.builder.Builder;
import org.creational.builder.builder.Director;
import org.creational.builder.builder.TruckBuilder;
import org.creational.builder.builder.TruckSchemaBuilder;
import org.creational.builder.product.TruckSchema;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static void main( String[] args )
    {
        Director director = new Director();

        TruckBuilder truckBuilder = new TruckBuilder();
        director.buildTata(truckBuilder);
        truckBuilder.model("MahaBali");
        truckBuilder.build();
        System.out.println( truckBuilder );
        System.out.println("*****************************");
        TruckSchemaBuilder schemaBuilder = new TruckSchemaBuilder();
        director.buildMahindra(schemaBuilder);
        schemaBuilder.model("MahaRathi").nbrOfDoors(2);
        schemaBuilder.build();
        System.out.println(schemaBuilder);
    }
}

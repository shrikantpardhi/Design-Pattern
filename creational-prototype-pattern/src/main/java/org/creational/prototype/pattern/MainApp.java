package org.creational.prototype.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static void main( String[] args )
    {
        List<Animal> animalList = List.of(
                new Tiger(4, "Tiger", "White", true, "Carnivore"),
                new Cow (4, "Cow", "Red", true, "Herbivore")
        );
        List<Animal> copyAnimals = new ArrayList<>();
        animalList.forEach(animal -> copyAnimals.add(animal.clone()));
        copyAnimals.forEach(System.out::println);

        System.out.println( "Hello World!" );
        System.out.println("*******************************");

        System.out.println("Using Prototype Registry");
        AnimalCache cache = new AnimalCache();
        cache.put(animalList);
        System.out.println(cache.get("Cow Red"));
        System.out.println(cache.get("Tiger White"));
    }
}

package org.creational.prototype.pattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalCache {
    private final Map<String, Animal> animalMap = new HashMap<>();

    public AnimalCache() {
        animalMap.put("Tiger", new Tiger(4, "Tiger", "white", true, "carnivore"));
        animalMap.put("Cow", new Cow(4, "Cow", "white", true, "Herbivore"));
    }

    public Animal get(String key) {
        return animalMap.get(key);
    }

    public void put(List<Animal> animals) {
        animals.forEach(animal -> animalMap.put(animal.getName()+" "+animal.getColor(), animal));
    }
}

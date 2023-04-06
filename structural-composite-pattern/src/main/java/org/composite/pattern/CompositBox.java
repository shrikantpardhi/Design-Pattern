package org.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class CompositBox implements Box{
    private  final List<Box> boxes = new ArrayList<>();

    public CompositBox(Box... boxes) {
        this.boxes.addAll(List.of(boxes));
    }

    @Override
    public double calculatePrice() {
        return boxes.stream().mapToDouble(Box::calculatePrice).sum();
    }
}

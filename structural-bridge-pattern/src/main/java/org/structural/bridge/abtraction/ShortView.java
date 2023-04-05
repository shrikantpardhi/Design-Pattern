package org.structural.bridge.abtraction;

import org.structural.bridge.implementation.Resource;

public class ShortView extends View{
    public ShortView(Resource resource) {
        super(resource);
    }

    @Override
    public void show() {
        System.out.println("short snippet");
        this.resource.snippet();
    }
}

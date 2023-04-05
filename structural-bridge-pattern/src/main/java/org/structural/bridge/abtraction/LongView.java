package org.structural.bridge.abtraction;

import org.structural.bridge.implementation.Resource;

public class LongView extends View{

    public LongView(Resource resource) {
        super(resource);
    }

    @Override
    public void show() {
        System.out.println("long snippet");
        this.resource.snippet();
    }
}

package org.structural.bridge.abtraction;

import org.structural.bridge.implementation.Resource;

public abstract class View {
    Resource resource;

    public View(Resource resource) {
        this.resource = resource;
    }

    public abstract void show();
}

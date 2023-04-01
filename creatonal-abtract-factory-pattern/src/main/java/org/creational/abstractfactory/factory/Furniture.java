package org.creational.abstractfactory.factory;

import org.creational.abstractfactory.product.Chair;
import org.creational.abstractfactory.product.Sofa;

public abstract class Furniture {
    public abstract Chair getChair();
    public abstract Sofa getSofa();
}

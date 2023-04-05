package org.structural.adapter.pattern.service;

import org.structural.adapter.pattern.model.XmlData;

public class RestaurentService implements Restaurant{
    @Override
    public void displayMenus(XmlData xmlData) {
        System.out.println( "RestaurentService" );
    }
}

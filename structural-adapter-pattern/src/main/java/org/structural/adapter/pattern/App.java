package org.structural.adapter.pattern;

import org.structural.adapter.pattern.adapter.UiServiceAdapter;
import org.structural.adapter.pattern.model.XmlData;
import org.structural.adapter.pattern.service.Restaurant;
import org.structural.adapter.pattern.service.RestaurentService;
import org.structural.adapter.pattern.service.UiService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        XmlData xmlData = new XmlData();

        System.out.println( "Without adapter" );
        Restaurant restaurant = new RestaurentService();
        restaurant.displayMenus(xmlData);
        System.out.println( "*******************" );

        System.out.println( "Using adapter" );
        UiServiceAdapter adapter = new UiServiceAdapter();
        adapter.displayMenus(xmlData);
    }
}

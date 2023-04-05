package org.structural.bridge.pattern;

import org.structural.bridge.pattern.abtraction.IndiaRestaurant;
import org.structural.bridge.pattern.abtraction.ItalianRestaurant;
import org.structural.bridge.pattern.abtraction.Restaurent;
import org.structural.bridge.pattern.impl.PanPizza;
import org.structural.bridge.pattern.impl.Pizza;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pizza panPizza = new PanPizza();

        Restaurent endianRestaurant = new IndiaRestaurant(panPizza);
        endianRestaurant.prepare();
        System.out.println( "**************" );

        Restaurent italianRestaurent = new ItalianRestaurant(panPizza);
        italianRestaurent.prepare();
    }
}

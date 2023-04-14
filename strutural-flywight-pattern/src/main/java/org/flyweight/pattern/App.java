package org.flyweight.pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Store store = new Store();
        for (int i=0; i<10; i = i+2) {
            store.storeBook("name_"+i, 100.0+i, "Action", "MCU", "Other");
            store.storeBook("name_"+i+1, 200.0+i, "Action", "MCU", "Other");
        }
        store.display();
    }
}

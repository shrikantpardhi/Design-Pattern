package org.composite.pattern;

public class MainApp
{
    public static void main( String[] args )
    {
        ShopService shopService = new ShopService();
        shopService.createOrder(
                new CompositBox(new Mobile("Samsung", 500)),
                new CompositBox(
                        new Mobile("Motorola", 1000),
                        new Book("book", 500)
                )
        );
        System.out.println(shopService.calculatePrice());
    }
}

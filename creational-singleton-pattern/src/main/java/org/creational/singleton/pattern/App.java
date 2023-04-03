package org.creational.singleton.pattern;

/**
 * Hello world!
 *
 */
public class App  extends Thread
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() +" "+ Singleton.getInstance());
    }
    public static void main( String[] args )
    {
        for (int i = 0; i < 15; i++) {
            new App().start();
        }
    }
}

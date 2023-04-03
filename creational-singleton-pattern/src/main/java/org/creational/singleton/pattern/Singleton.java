package org.creational.singleton.pattern;

public class Singleton {
    /* use volatile to prevent partial instance of a class.*/
    private static volatile Singleton instance;

    /*
    * prevent direct access to constructor (prevent object creation)*/
    private Singleton() {}

    /*
    * return single instance*/
    public static Singleton getInstance() {
        //use local variable to prevent multiple access from main memory  due to volatile instance
        Singleton result = instance;
        if ( null == result) {
            synchronized (Singleton.class) {
                result = instance;
                if (null == result) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }

}

package org.structural.bridge.implementation;


public class BookResource implements Resource{
    Book book;

    public BookResource() {
        this.book = new Book();
    }

    @Override
    public void snippet() {
        System.out.println("Book snippet");
    }

    @Override
    public void title() {
        System.out.println("Book title "+ book.title);
    }

    @Override
    public void image() {
        System.out.println("Book snippet "+ book.image);
    }
}

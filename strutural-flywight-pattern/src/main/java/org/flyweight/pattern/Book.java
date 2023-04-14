package org.flyweight.pattern;

public class Book {
    private String name;
    public Double price;
    public BookType bookType;

    public Book(String name, Double price, BookType bookType) {
        this.name = name;
        this.price = price;
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", bookType=" + bookType +
                '}';
    }
}

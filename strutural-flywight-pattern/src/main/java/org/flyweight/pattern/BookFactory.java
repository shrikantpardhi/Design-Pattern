package org.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static Map<String, BookType> bookTypeMap = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
        if (bookTypeMap.get(type) == null) {
            bookTypeMap.put(type, new BookType(type, distributor, otherData));
        }
        return bookTypeMap.get(type);
    }
}

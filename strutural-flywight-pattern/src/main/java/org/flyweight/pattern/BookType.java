package org.flyweight.pattern;

public class BookType {
    private String type;
    private String distributor;
    private String otherData;

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "type='" + type + '\'' +
                ", distributor='" + distributor + '\'' +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}

package ro.fasttrackit.records;

import java.util.Objects;

public class Book {
    public static final String NO_NAME = "NO-NAME";
    private final String name;
    private final String author;
    private final Double price;

    public Book(String name, String author, Double price) {
        if (author.isBlank()) {
            this.author = "UNKNOWN";
        } else {
            this.author = author;
        }

        this.name = name.isBlank() ? NO_NAME : name;

        this.price = price;
    }

    public String name() {
        return name;
    }

    public String author() {
        return author;
    }

    public Double price() {
        return price;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(price, book.price);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, author, price);
//    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

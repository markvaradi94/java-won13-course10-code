package ro.fasttrackit.collections;

import ro.fasttrackit.records.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionsMain {
    public static void main(String[] args) {
        Collection<Object> objects = new ArrayList<>();
        objects.add(new Book("Book1", "Mihai", 20.4));
        objects.add(29);
        objects.add("Hello");
        objects.add(new Scanner(System.in));
    }
}

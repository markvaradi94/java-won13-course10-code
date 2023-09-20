package ro.fasttrackit;

import ro.fasttrackit.records.BookRecord;

public class Main {
    public static void main(String[] args) {
        BookRecord cleanCode = new BookRecord("Clean Code", "Uncle Bob", 250.4);
        BookRecord designPatterns = new BookRecord("Design Patterns", "   ", 245.4);

        System.out.println(cleanCode);
        System.out.println(designPatterns);
    }
}
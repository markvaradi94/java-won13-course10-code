package ro.fasttrackit.collections.map;

import ro.fasttrackit.records.Book;
import ro.fasttrackit.records.BookRecord;

import java.util.*;

public class MapsMain {
    public static void main(String[] args) {
        Map<String, Double> titleToPrice = new HashMap<>();
        BookRecord cleanCode = new BookRecord("Clean Code", "Uncle Bob", 250.4);
        BookRecord designPatterns = new BookRecord("Design Patterns", "Eric Gamma", 245.4);
        BookRecord cleanArchitecture = new BookRecord("Clean Architecture", "Eric Gamma", 310.4);
        BookRecord cleanArchitecture2 = new BookRecord("Clean Coder", "Eric Gamma", 450.5);
        List<BookRecord> books = List.of(cleanCode, cleanArchitecture, designPatterns, cleanArchitecture2);

        System.out.println("======================================");
        Map<String, List<BookRecord>> letterToTitle = new TreeMap<>();

        for (BookRecord book : books) {
            String firstLetter = String.valueOf(book.name().charAt(0)).toUpperCase();    // C --> [Clean Code, Clean Architecture]
            List<BookRecord> bookList = letterToTitle.get(firstLetter);                 // D -> [Design Patterns]

            if (bookList != null) {
                bookList.add(book);
            } else {
                List<BookRecord> bookRecords = new ArrayList<>();
                bookRecords.add(book);
                letterToTitle.put(firstLetter, bookRecords);
            }
        }

        System.out.println(letterToTitle);

//        for (BookRecord book : books) {
//            titleToPrice.put(book.name(), book.price());
//        }
//
//        System.out.println(titleToPrice);
//        System.out.println("======================================");
//
//        Map<String, List<String>> authorToTitles = new HashMap<>();
//        for (BookRecord book : books) {
//            List<String> bookNames = authorToTitles.get(book.author());
//            // if map doesn't have the key you are looking for --> returns null
//            if (bookNames != null) {
//                bookNames.add(book.name());
//            } else {
////                List<String> names = List.of(book.name());  // immutable list ---> elements cannot be added
//                List<String> names = new ArrayList<>();
//                names.add(book.name());
//                authorToTitles.put(book.author(), names);
//            }
////            authorToTitles.put(book.author(), book.name());
//        }

//        System.out.println(authorToTitles);
//        System.out.println("======================================");
//
//        for (Map.Entry<String, List<String>> entry : authorToTitles.entrySet()) {
//            System.out.printf("map key = %s%n", entry.getKey());
//            System.out.printf("map value for key %s = %s %n", entry.getKey(), entry.getValue());
//        }

//        Book book1 = new Book("Book1", "A1", 10.1);
//        Book book11 = new Book("Book1", "A1", 10.1);
//        Book book111 = new Book("Book1", "A1", 10.1);
//        Book book2 = new Book("Book2", "A2", 22.1);
//        Book book3 = new Book("Book3", "A3", 33.1);
//        List<Book> badBooks = List.of(book1, book11, book111, book2, book3);
//
//        Map<Book, String> testMap = new HashMap<>();
//        for (Book badBook : badBooks) {
//            testMap.put(badBook, badBook.name());
//        }
//        System.out.println(testMap);

    }
}

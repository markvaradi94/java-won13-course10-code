package ro.fasttrackit.collections.list;

import ro.fasttrackit.records.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Mihai", 20.4));
        books.add(new Book("Book2", "George", 21.4));

        System.out.println(books.get(0));
        books.add(1, new Book("Book3", "Ana", 44.5));
        System.out.println(books);

        int size = books.size();
        books.remove(new Book("Book1", "Mihai", 20.4));
//        books.remove(0);
        System.out.println(books);


        System.out.println("========================================");
        LinkedList<String> linkedStrings = new LinkedList<>();
        linkedStrings.add("A");
        linkedStrings.add("B");
        linkedStrings.add("C");
        linkedStrings.add("D");

        linkedStrings.addLast("Z");

        linkedStrings.get(4);
//        linkedStrings.removeLast()

        System.out.println(linkedStrings);
    }
}

//package ro.fasttrackit.collections.set;
//
//import ro.fasttrackit.records.Book;
//import ro.fasttrackit.records.Person;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class SetsMain {
//    public static void main(String[] args) {
//        Set<Person> people = new HashSet<>();
//        people.add(new Person("Mihai", "Grozav", 25));
//        people.add(new Person("Alex", "Negru", 44));
//        people.add(new Person("Ana", "Pop", 33));
//        people.add(new Person("Ana", "Pop", 33));
//        people.add(new Person("Ana", "Pop", 33));
//
//        Iterator<Person> iterator = people.iterator();
//        while (iterator.hasNext()) {
//            Person person = iterator.next();
//            System.out.println(person);
//        }
//
////        for (Person person : people) {
////            System.out.println(person);
////        }
//
//        System.out.println("================================");
//
//        Set<Book> books = new HashSet<>();
//        books.add(new Book("Book1", "Author1", 55.4));
//        books.add(new Book("Book1", "Author1", 55.4));
//        books.add(new Book("Book1", "Author1", 55.4));
//
//        System.out.println(books);
//        System.out.println("================================");
//
////        Set<Person> treePeople = new TreeSet<>();
////        treePeople.add(new Person("Mihai", "Grozav", 25));
////        treePeople.add(new Person("Alex", "Negru", 44));
////        treePeople.add(new Person("Ana", "Pop", 33));
////        treePeople.add(new Person("Andrei", "Iliescu", 33));
////        System.out.println(treePeople);
//    }
//}

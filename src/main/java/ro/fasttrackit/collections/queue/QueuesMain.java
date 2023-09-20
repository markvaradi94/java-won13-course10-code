package ro.fasttrackit.collections.queue;

import ro.fasttrackit.records.Person;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueuesMain {
    public static void main(String[] args) {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.priority(), o2.priority());
            }
        });

        priorityQueue.add(new Person("Gica", "Contra", 20, 5));
        priorityQueue.add(new Person("Ana", "Axahbx", 44, 2));
        priorityQueue.add(new Person("Paul", "Nvgsdakj", 54, 1));
        System.out.println(priorityQueue);

        Person firstPriority = priorityQueue.poll();
        // returns the element with the lowest priority value and eliminates from the queue
        System.out.println(firstPriority);
    }
}

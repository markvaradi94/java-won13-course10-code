package ro.fasttrackit.records;

import java.util.Comparator;

public record Person(
        String firstName,
        String lastName,
        Integer age,
        Integer priority
) implements Comparable<Person> {
    public int compareTo(Person otherPerson) {
        Comparator<Person> comparator = Comparator.comparing(Person::age)
                .thenComparing(Person::lastName)
                .thenComparing(Person::firstName);

        return comparator.compare(this, otherPerson);

//        return Integer.compare(age, otherPerson.age);
        // value == 0 ---> objects are equal
        // value < 0  ---> first object is larger
        // value > 0  ---> second object is larger
    }
}

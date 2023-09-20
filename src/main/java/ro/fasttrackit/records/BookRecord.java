package ro.fasttrackit.records;

public record BookRecord (
        String name,
        String author,
        Double price
) {

    public BookRecord {
        if (author.isBlank()) {
            author = "UNKNOWN";
        }
    }

//    public BookRecord(String name, String author) {
//        this(name, author, 0.0);
//    }
}

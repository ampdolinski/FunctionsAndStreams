package _10_zadanie10_stream;

public class DuplicateEntryException extends Exception {
    private Book book;

    public DuplicateEntryException() {
        this.book = book;
    }

    @Override
    public String getMessage() {
        return "Book with this ISBN already exists: \n" + book.toString();
    }
}
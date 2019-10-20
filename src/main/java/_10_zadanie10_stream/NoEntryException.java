package _10_zadanie10_stream;

public class NoEntryException extends Exception {

    private Book book;

    public NoEntryException() {
        this.book = book;
    }

    @Override
    public String getMessage() {
        return "This book doesn't exists: \n" + book.toString();
    }
}

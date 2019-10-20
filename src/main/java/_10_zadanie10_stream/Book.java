package _10_zadanie10_stream;

public class Book {

    private String isbn;
    private String title;
    private Integer howManyPages;
    private Genres genre;
    private Author author;
    private Integer publishedYear;

    public Book(String isbn, String title, Integer howManyPages, Genres genre, Author author, Integer publishedYear) {
        this.isbn = isbn;
        this.title = title;
        this.howManyPages = howManyPages;
        this.genre = genre;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public Book deleteBook() {
    isbn = null;
    title = null;
    howManyPages = null;
    genre = null;
    author = null;
    publishedYear = null;
    return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHowManyPages() {
        return howManyPages;
    }

    public void setHowManyPages(Integer howManyPages) {
        this.howManyPages = howManyPages;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }



    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", howManyPages=" + howManyPages +
                ", genre=" + genre +
                ", author=" + author +
                ", publishedYear=" + publishedYear +
                '}';
    }
}

package _10_zadanie10_stream;

import _9_zadanie9_stream.BrakOcenyException;

import javax.lang.model.type.IntersectionType;
import java.awt.*;
import java.net.Inet4Address;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

   private Map<String, Book> bookshelf = new HashMap<>();

//    private Book book;

//    private Collection<Book> readBooks() {
//        return new ArrayList<>(this.bookshelf.values());
//    }

    private Book method1isbnSearch(String isbn) {
        return this.bookshelf.get(isbn);
    }

    void method2addBook(Book book) throws DuplicateEntryException {
        if (bookshelf.containsKey(book.getIsbn()))
            throw new DuplicateEntryException();
        bookshelf.put(book.getIsbn(), book);

    }

    void method3deleteBook1(Book book) throws NoEntryException {
        this.method4deleteBook2(book.getIsbn());
    }

    void method4deleteBook2(String isbn) throws NoEntryException {
        Book remove = bookshelf.remove(isbn);
        if (remove == null)
            throw new NoEntryException();
    }

    Book method5findBook(String isbn) throws NoEntryException {
        Book book = bookshelf.get(isbn);
        if (book == null)
            throw new NoEntryException();
        return book;
    }

    List<Book> method6listOfBooks() {
        return this.bookshelf.values()
                .stream()
                .collect(Collectors.toList());
    }

    List<Book> method7listOfBooksInYear(Integer checkedYear) {
        return this.bookshelf.values()
                .stream()
                .filter(book -> book.getPublishedYear() == checkedYear)
                .sorted(Comparator.comparing(book -> book.getAuthor().getSurname()))
                .collect(Collectors.toList());
    }

    List<Book> method8listOfBooksWithMorePages(Integer pages) {
        return this.bookshelf.values()
                .stream()
                .filter(book -> book.getHowManyPages() > pages)
                .sorted(Comparator.comparing(Book::getPublishedYear).thenComparing(Book::getTitle))
                .collect(Collectors.toList());
    }

//    List<Book> method9() {
//        return;
//    }





//      1chcemy szybko wyszukiwac ksiazki po ISBN
//      2dodanie ksiazki, jesli dodajemy o tym samym id (ISBN) rzuca wyjatek DuplicateEntryException
//      3usuniecie ksiazki, jesli usuwamy ksiazke ktorej nie mam rzuca wyjatek NoEntryException
//      4usuniiecie ksiazki po ISBN, jesli usuwamy ksiazke ktorej nie mam rzuca wyjatek NoEntryException
//      5wyszkuwanie ksiazki po ISBN, jesli nie ma ksiazki rzuca wyjatek NoEntryException
//      6wszystkie ksiazki
//      7znajdz ksiazki opublikowane w danym roku uporzadkowane po nazwisku autora malejaco
//      8znajdz ksiazki ktore maja wiecej stron niz podano uporzadkowane najpierw po roku publikacji i nastepnie po tytule
//      9znajdz ksiazki, ktorych rok publikacji jest wiekszy niz podany i kraj autora jest taki jak podany i pierwsza litera nazwika autora jest taka jak podano
//      10wyznacz srednia ilosc stron w ksiazkach z podanego gatunku
//

}

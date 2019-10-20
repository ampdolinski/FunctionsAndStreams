package _9_zadanie9_stream;

public class BrakOcenyException extends Exception {

    private Przedmioty przedmiot;

//    public BrakOcenyException(String nazwaPrzedmiotu) {
//        super("Brak oceny z przedmiotu: " + nazwaPrzedmiotu);
//    }

    public BrakOcenyException(Przedmioty przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public String getMessage() {

        return "Brak oceny z przedmiotu: " + przedmiot.name();
    }
}

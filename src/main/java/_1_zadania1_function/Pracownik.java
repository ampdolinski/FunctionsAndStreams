package _1_zadania1_function;

public class Pracownik {

    String imie;
    String nazwisko;

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    Urlop urlop;

    public Pracownik(String imie, String nazwisko, Urlop urlop) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.urlop = urlop;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Urlop getUrlop() {
        return urlop;
    }

    public void setUrlop(Urlop urlop) {
        this.urlop = urlop;
    }
}

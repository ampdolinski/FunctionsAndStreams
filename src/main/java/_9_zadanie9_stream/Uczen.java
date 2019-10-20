package _9_zadanie9_stream;

public class Uczen {
    private String imie;
    private String nazwisko;
    private Klasa klasa;

    public Uczen(String imie, String nazwisko, Klasa klasa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
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

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", klasa=" + klasa +
                '}';
    }
}

package _8_zadanie8_streams;

//import org.omg.CORBA.INTERNAL;

public class Pracownik {

    private String imie;
    private Plec plec;
    private Departament departament;
    private Integer pensja;

    public Pracownik(String imie, Plec plec, Departament departament, int pensja) {
        this.imie = imie;
        this.plec = plec;
        this.departament = departament;
        this.pensja = pensja;
    }



    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }
}

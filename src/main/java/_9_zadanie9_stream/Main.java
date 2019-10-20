package _9_zadanie9_stream;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Uczen uczen1 = new Uczen("Jacek", "Kowalski", Klasa.A);
//        Uczen uczen2 = new Uczen("Agatka", "Jarecka", Klasa.B);
//        Uczen uczen3 = new Uczen("Gabriel", "Kowal", Klasa.C);
//        Uczen uczen4 = new Uczen("Henryk", "Jasny", Klasa.D);
//        Uczen uczen5 = new Uczen("Maja", "Warta", Klasa.A);
//        Uczen uczen6 = new Uczen("Karolina", "Lekka", Klasa.B);
//        Uczen uczen7 = new Uczen("Natalia", "Zalewska", Klasa.C);
//        Uczen uczen8 = new Uczen("Borys", "Godunow", Klasa.D);


        Dzienniczek dzienniczek = new Dzienniczek(uczen1);
        dzienniczek.wstawianieOceny(Przedmioty.POLSKI, new Ocena(TypOceny.PISEMNA, LocalDateTime.now(), 5, Przedmioty.POLSKI));
        dzienniczek.wstawianieOceny(Przedmioty.HISTORIA, new Ocena(TypOceny.USTNA, LocalDateTime.now(), 4, Przedmioty.HISTORIA));

        System.out.println(dzienniczek);

        try {
            dzienniczek.odczytanieOceny(Przedmioty.POLSKI, TypOceny.PISEMNA);
            System.out.println(dzienniczek.poprawianieOceny(Przedmioty.POLSKI, TypOceny.PISEMNA));
            dzienniczek.odczytanieOceny(Przedmioty.WF, TypOceny.PISEMNA);
            dzienniczek.odczytanieOceny(Przedmioty.HISTORIA, TypOceny.PISEMNA);
        } catch (BrakOcenyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(dzienniczek);

        System.out.println();

    }
}

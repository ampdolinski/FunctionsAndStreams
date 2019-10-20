package _9_zadanie9_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Dzienniczek {

    private Uczen uczen;

    //wewnętrzna implementacja - to pole nie ma gettera i settera,
    //komunikujemy się z dzienniczkiem używając publicznego API,
    //nikogo nie powinno obchodzić, że dzienniczek ma w sobie strukturę mapy,
    //interesuje ich tylko, że może dodawać i poprawiać oceny, itp.
    private Map<Przedmioty, List<Ocena>> oceny = new HashMap<>();

    public Dzienniczek(Uczen uczen) {
        this.uczen = uczen;
    }

    public Uczen getUczen() {
        return uczen;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[" + uczen.getImie() + " " + uczen.getNazwisko() + "]");
        oceny.forEach(((przedmioty, oceny) -> {
            builder.append("\n" + przedmioty + " \n");
            oceny.forEach(ocena -> builder.append(" \n" + ocena.getTypOceny() + ", " + ocena.getDataOceny() + ", "
            + ocena.getWartoscOceny() + ", " + ocena.getPrzedmiot() + " \n"));
        }));
        return builder.toString();
    }

    public Collection<Ocena> odczytajOceny() {
        return this.oceny.values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Ocena> odczytajOceny(Przedmioty przedmioty) {
        return this.oceny.computeIfAbsent(przedmioty, p -> new ArrayList<>());
    }

    public boolean wstawianieOceny(Przedmioty przedmioty, Ocena ocena) {

        return this.odczytajOceny(przedmioty).add(ocena);

        //to samo, co wyżej, tylko rozpisane ręcznie
//        List<Ocena> ocenyZPrzedmiotu = this.oceny.get(przedmioty);
//        if (ocenyZPrzedmiotu == null) {
//            ocenyZPrzedmiotu = new ArrayList<>();
//            this.oceny.put(przedmioty, ocenyZPrzedmiotu);
//        }
//        return ocenyZPrzedmiotu.add(ocena);
        }

        public Ocena odczytanieOceny(Przedmioty przedmioty, TypOceny typOceny) throws BrakOcenyException {

       return this.odczytajOceny(przedmioty).stream()
                .filter(ocena -> typOceny.equals(ocena.getTypOceny()))
                .min(Comparator.comparing(Ocena::getDataOceny))
                .orElseThrow(() -> new BrakOcenyException(przedmioty));

//     Optional<Ocena> first = this.odczytajOceny(przedmioty).stream()
//             .filter(ocena -> typOceny.equals(ocena.getTypOceny()))
//             .min(Comparator.comparing(Ocena::getDataOceny));
//
//     if (!first.isPresent())
//         throw new BrakOcenyException(przedmioty);
//     else
//         return first.get();
        }

    public Ocena poprawianieOceny(Przedmioty przedmioty, TypOceny typOceny) throws BrakOcenyException {
        return this.odczytanieOceny(przedmioty, typOceny).popraw();
    }

    public Collection<Przedmioty> kolekcjaPrzedmiotow() {
        return this.oceny.keySet();
    }

    public OptionalDouble srednia() {
        //dobrzucić zabezpieczenie na brak OptionalDouble'a (dorzucić if-a dla "0")
        return this.odczytajOceny().stream().mapToInt(Ocena::getWartoscOceny).average();
    }



//    @Override
//    public String toString() {
//        return "Dzienniczek{" +
//                "uczen=" + uczen +
//                '}';
//    }
}
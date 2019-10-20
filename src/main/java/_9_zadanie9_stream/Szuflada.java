package _9_zadanie9_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Szuflada {

    private Map<String, List<Dzienniczek>> przegrodki = new HashMap<>();

    private void wlozDzienniczek(Dzienniczek dzienniczek) {
        String pierwszaLiteraNazwiska = dzienniczek.getUczen().getNazwisko().substring(0,1);
        this.przegrodki.computeIfAbsent(pierwszaLiteraNazwiska, litera -> new ArrayList<>()).add(dzienniczek);
    }

    private List<Dzienniczek> metoda1(String litera) {
        return this.przegrodki.get(litera);
    }

    private List<Ocena> metoda2(Przedmioty przedmioty, String litera) {
        return this.metoda1(litera).stream().
                flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmioty).stream())
                .collect(Collectors.toList());

    }

    private Stream<Dzienniczek> getWszystkieDzienniczkiZSzuflady() {
        return this.przegrodki.values()
                .stream()
                .flatMap(Collection::stream);
    }

    private long metoda3(Przedmioty przedmioty) {

        return getWszystkieDzienniczkiZSzuflady()
                .flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmioty).stream())
                .count();

//        Stream<List<Dzienniczek>> stream = this.przegrodki.values().stream();
//        Stream<Dzienniczek> wszystkieDzienniczkiZCalejSzuflady =
//                stream.flatMap(listaDzienniczkow -> listaDzienniczkow.stream());
//        Stream<Ocena> ocenaStream = wszystkieDzienniczkiZCalejSzuflady.flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmioty).stream());
//        return ocenaStream.count();
    }

    private boolean metoda4(Przedmioty przedmioty) {
        return getWszystkieDzienniczkiZSzuflady()
                .noneMatch(dzienniczek -> dzienniczek.odczytajOceny(przedmioty).isEmpty());
    }

    public boolean metoda5(String imieUcznia) {
        return getWszystkieDzienniczkiZSzuflady()
                .anyMatch(dzienniczek -> dzienniczek.getUczen().getImie().equals(imieUcznia));
    }

    public boolean metoda6(Przedmioty przedmioty) {
        return getWszystkieDzienniczkiZSzuflady()
                .noneMatch(dzienniczek -> dzienniczek.odczytajOceny(przedmioty).isEmpty());
    }

    public Optional<Integer> metoda7(Przedmioty przedmioty, Klasa klasa) {
        return getWszystkieDzienniczkiZSzuflady()
                .filter(dzienniczek -> dzienniczek.getUczen().getKlasa().equals(klasa))
                .flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmioty).stream())
                .min(Comparator.comparing(Ocena::getWartoscOceny))
                .map(Ocena::getWartoscOceny);
    }


    public OptionalDouble metoda8(Przedmioty przedmioty, TypOceny typOceny) {
        return getWszystkieDzienniczkiZSzuflady()
                .flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmioty).stream())
                .filter(dzienniczek -> dzienniczek.getTypOceny().equals(typOceny))
                .mapToInt(Ocena::getWartoscOceny)
                .average();
    }

    public Optional<Integer> metoda9(int iloscPrzedmiotowPowyzej) {
        return getWszystkieDzienniczkiZSzuflady()
                .filter(dzienniczek -> dzienniczek.kolekcjaPrzedmiotow().size() > iloscPrzedmiotowPowyzej)
                .flatMap(dzienniczek -> dzienniczek.odczytajOceny().stream())
                .max(Comparator.comparing(Ocena::getWartoscOceny))
                .map(Ocena::getWartoscOceny);
    }

    public Collection<Uczen> metoda10(double granicaZagrozenia) {
        return getWszystkieDzienniczkiZSzuflady()
                .filter(dzienniczek -> dzienniczek.srednia().getAsDouble() < granicaZagrozenia)
                .map(Dzienniczek::getUczen)
                .collect(Collectors.toList());
    }

}

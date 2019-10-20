package _8_zadanie8_streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static _8_zadanie8_streams.Pracownicy.PRACOWNICY;

public class AnalizaDanychPracownikow {

    public Optional<Integer> metoda3a_v1() {
        return PRACOWNICY.stream().map(Pracownik::getPensja).reduce(Integer::sum);
    }

    public Optional<Integer> metoda3a_v2() {
        return PRACOWNICY.stream().map(Pracownik::getPensja).collect(Collectors.reducing(Integer::sum));
    }

    public Integer metoda3a_v3() {
        return PRACOWNICY.stream().mapToInt(Pracownik::getPensja).sum();
    }

    public Integer metoda3a_v4() {
        return PRACOWNICY.stream().collect(Collectors.summingInt(Pracownik::getPensja));
    }

    public Map<Pracownik, Departament> metoda4() {
        return PRACOWNICY.stream().collect(Collectors.toMap(Function.identity(), Pracownik::getDepartament));
//        return PRACOWNICY.stream().collect(Collectors.toMap(pracownik -> pracownik, pracownik -> pracownik.getDepartament));

    }

    public Map<String, Integer> metoda5() {
        return PRACOWNICY.stream().collect(Collectors.toMap(Pracownik::getImie, Pracownik::getPensja));
    }

    public Map<Boolean, List<Pracownik>> metoda6() {
        return PRACOWNICY.stream().collect(Collectors.partitioningBy(pracownik -> Plec.K.equals(pracownik.getPlec())));
    }


    public Map<Departament, List<Pracownik>> metoda7() {
        return PRACOWNICY.stream().collect(Collectors.groupingBy(Pracownik::getDepartament));
    }


    //przeciążona metoda, polimorfizm statyczny
    public Map<Plec, Integer> metoda8() {
        return PRACOWNICY.stream().collect(Collectors.toMap(
                Pracownik::getPlec,
                Pracownik::getPensja,
                Integer::sum));
    }

    //pogrupuj pracowników po płci, zliczając, ilu ich jest (danej płci) -> mapa płeć na ilość osób

}

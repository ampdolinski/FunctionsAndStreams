package _8_zadanie8_streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static _8_zadanie8_streams.Pracownicy.PRACOWNICY;

public class Main {
    public static void main(String[] args) {

        AnalizaDanychPracownikow analizaDanych = new AnalizaDanychPracownikow();
//
//        Map<Pracownik, Departament> pracownikDepartamentMap = analizaDanych.metoda4();
//        pracownikDepartamentMap.forEach(((pracownik, departament) ->
//                System.out.println(pracownik.getPlec()
//                + " - " + pracownik.getDepartament())));
//
//        Map<String, Integer> imieNaPensjeMap = analizaDanych.metoda5();
//        imieNaPensjeMap.forEach((imie, pensja) -> System.out.println(imie + " - " + pensja));

//        Map<Boolean, List<Pracownik>> pracownicyPoPlciMap = analizaDanych.metoda6();
//        pracownicyPoPlciMap.forEach((czyKobieta, pracownicy) -> {
//            System.out.println("Czy kobieta?:" + czyKobieta);
//        pracownicy.forEach(pracownik -> System.out.println(pracownik.getImie()));
//        });

//          coś nie działa... :(
//        Map<Departament, List<Pracownik>> grupowaniePracownikowPoDepartamentach = analizaDanych.metoda7();
//        grupowaniePracownikowPoDepartamentach.forEach(((departament, pracownicy) -> System.out.println( departament.getNazwa() + " - " + pracownicy)));
    }



}

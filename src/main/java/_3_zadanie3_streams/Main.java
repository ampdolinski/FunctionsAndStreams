package _3_zadanie3_streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] tablica = new Integer[101];
        for (int i = 0; i < 100; i++) {
            tablica[i] = i;
        }

        //jeszcze przydałoby się losować liczby z tej tablicy,
//        a nie pierwsze 10...

        Arrays.stream(tablica).limit(10)
//                .filter(liczba -> liczba % 2 == 0)
//                .map(liczba -> liczba * 10)
//                .sorted(Comparator.reverseOrder())
//                .skip(3)
                .forEach(System.out::println)
                ;

    }

}

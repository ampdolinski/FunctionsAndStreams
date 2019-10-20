package _6_zadanie6_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaLiczb = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("\nWejściowa lista: ");
        listaLiczb.forEach(element -> System.out.println(element + " "));

        System.out.println("\nPrzetwarza, elementy listy wejsciowej, co daje w wyniku: ");
        listaLiczb.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 10)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("\nWyjściowa lista: ");
        listaLiczb.forEach(element -> System.out.println(element + " "));



    }
}
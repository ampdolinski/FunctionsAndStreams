package _1_zadania1_function;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, Integer> rreturn = number -> number = number;
        System.out.println(rreturn.apply(10));

        Function<String, Integer>  length = String::length;
        System.out.println(length.apply("ksdfgasukygfdsjaf"));


     Function<Integer, Integer> multiply = x -> x > 0 ? x * -x : x * x;

        System.out.println(multiply.apply(-10));
        System.out.println(multiply.apply(3));

        Function<String, Integer> stringIntegerFunction = length.andThen(multiply);
        System.out.println(stringIntegerFunction.apply("WYNIK"));

//    Function<String, Czlowiek> nameToHoman = name -> new Czlowiek(name);

        Pracownik pracownik1 = new Pracownik("Jurek", "Kowalski");

        pracownik1.setUrlop(new Urlop(
                LocalDate.of(2017, 10, 13),
                LocalDate.of(2017, 11, 15)));


    Function<Pracownik, String> inicjaly = pracownik -> pracownik.getImie().charAt(0) + " " + pracownik.getNazwisko().charAt(0);

        System.out.println(inicjaly.apply(pracownik1));

    Function<Pracownik, Integer> urlopik = pracownik -> Period.between(
            pracownik.getUrlop().getDataOd(),
            pracownik.getUrlop().getDataDo())
            .getDays();

        System.out.println(urlopik.apply(pracownik1));



//    Function<String, Czlowiek>


    }
}

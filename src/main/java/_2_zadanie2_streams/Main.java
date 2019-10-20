package _2_zadanie2_streams;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

//import static javafx.scene.input.KeyCode.ALPHANUMERIC;
//import static javafx.scene.input.KeyCode.T;

public class Main {
    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Stream.generate( () -> {
                    int pozycja = new Random().nextInt(alphabet.length());
                    //tylko do końca długości, bo jest exclusive
                    return alphabet.charAt(pozycja);
                }).limit(10).sorted().forEach(System.out::println);


//        Stream<Character> strumienLosowy =

    }
}

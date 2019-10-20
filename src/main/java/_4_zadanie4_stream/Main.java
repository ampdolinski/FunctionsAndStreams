package _4_zadanie4_stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("produkty.txt");

        Stream<String> lines = Files.lines(path);
        lines.forEach(System.out::println);

//        Stream<String> names = lines.map(line -> line.split(";")[1]);
//        Stream<String> filtered = names.filter(name -> name.endsWith("o"));
//        filtered.forEach(System.out::println);

        Files.lines(Paths.get("produkty.txt"))
                .map(line -> line.split(";")[1])
                .filter(name -> name.endsWith("o"))
                .forEach(System.out::println);

    }
}

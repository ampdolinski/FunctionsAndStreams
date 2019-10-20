package _7_zadanie7_stream;

import java.util.stream.Stream;

public class Komentarz {

    String tresc;

    public Komentarz(String tresc) {
        this.tresc = tresc;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    @Override
    public String toString() {
        return "Komentarz{" +
                "tresc='" + tresc + '\'' +
                '}';
    }
}

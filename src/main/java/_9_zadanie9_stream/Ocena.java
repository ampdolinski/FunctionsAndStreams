package _9_zadanie9_stream;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ocena {
    private TypOceny typOceny;
    private LocalDateTime dataOceny;
    private Integer wartoscOceny;
    private Przedmioty przedmiot;

    public Ocena(TypOceny typOceny, LocalDateTime dataOceny, Integer wartoscOceny, Przedmioty przedmiot) {
        this.typOceny = typOceny;
        this.dataOceny = dataOceny;
        this.wartoscOceny = wartoscOceny;
        this.przedmiot = przedmiot;
    }

    public Ocena popraw() {
        wartoscOceny = wartoscOceny + 1;
        this.dataOceny = LocalDateTime.now();
        return this;
    }

    public TypOceny getTypOceny() {
        return typOceny;
    }

    public void setTypOceny(TypOceny typOceny) {
        this.typOceny = typOceny;
    }

    public LocalDateTime getDataOceny() {
        return dataOceny;
    }

    public void setDataOceny(LocalDateTime dataOceny) {
        this.dataOceny = dataOceny;
    }

    public Integer getWartoscOceny() {
        return wartoscOceny;
    }

    public void setWartoscOceny(Integer wartoscOceny) {
        this.wartoscOceny = wartoscOceny;
    }

    public Przedmioty getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(Przedmioty przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Ocena{" +
                "typOceny=" + typOceny +
                ", dataOceny=" + dataOceny +
                ", wartoscOceny=" + wartoscOceny +
                ", przedmiot=" + przedmiot +
                '}';
    }


}


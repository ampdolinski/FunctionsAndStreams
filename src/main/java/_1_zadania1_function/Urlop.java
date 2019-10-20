package _1_zadania1_function;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Urlop {

    private LocalDate dataOd;
    private LocalDate dataDo;

    public Urlop(LocalDate dataOd, LocalDate dataDo) {
        this.dataOd = dataOd;
        this.dataDo = dataDo;
    }

    public LocalDate getDataOd() {
        return dataOd;
    }

    public void setDataOd(LocalDate dataOd) {
        this.dataOd = dataOd;
    }

    public LocalDate getDataDo() {
        return dataDo;
    }

    public void setDataDo(LocalDate dataDo) {
        this.dataDo = dataDo;
    }

}

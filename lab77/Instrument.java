package pl.imiajd.laska;

import java.time.LocalDate;
import java.util.Objects;

abstract class Instrument {

    public Instrument(String procudent,LocalDate rokProdukcji){
        this.procudent = procudent;
        this.rokProdukcji = rokProdukcji;
    }


    public String getProcudent() {
        return procudent;
    }


//    data produkcji
    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

//    rok produkcji
//    public int getRokProdukcji() {
//        return rokProdukcji.getYear();
//    }

    abstract void dzwiek();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(procudent, that.procudent) &&
                Objects.equals(rokProdukcji, that.rokProdukcji);
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "procudent='" + procudent + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }

    private String procudent;
    private LocalDate rokProdukcji;
}

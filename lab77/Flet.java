package pl.imiajd.laska;

import java.time.LocalDate;

public class Flet extends Instrument {

    public Flet(String procudent, LocalDate rokProdukcji){
        super(procudent, rokProdukcji);
    }

    public void dzwiek(){
        System.out.println("Flet: Producent instrumentu: " + getProcudent() + ", rok produkcji " + getRokProdukcji());

    }
}

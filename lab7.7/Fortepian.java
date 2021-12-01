package pl.imiajd.laska;

import java.time.LocalDate;

public class Fortepian extends Instrument{

    public Fortepian(String procudent, LocalDate rokProdukcji){
        super(procudent, rokProdukcji);
    }

    public void dzwiek(){
        System.out.println("Fortepian: Producent instrumentu: " + getProcudent() + ", rok produkcji: " + getRokProdukcji());

    }
}

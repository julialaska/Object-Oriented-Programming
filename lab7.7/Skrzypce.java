package pl.imiajd.laska;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Skrzypce extends Instrument {

    public Skrzypce(String procudent, LocalDate rokProdukcji){
        super(procudent, rokProdukcji);
    }

    public void dzwiek(){
        System.out.println("Skrzypce: Producent instrumentu: " + getProcudent() + ", rok produkcji: " + getRokProdukcji());
    }
}

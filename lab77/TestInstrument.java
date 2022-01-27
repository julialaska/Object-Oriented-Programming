package pl.imiajd.laska;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrument {

    public static void main(String[] args) {
//        Instrument[] orkiestra = new Instrument[5];

        ArrayList<Instrument> orkiestra = new ArrayList<>();

        Instrument int1 =  new Fortepian("Yamaha",  LocalDate. parse("2017-11-10"));
        Instrument int2 = new Skrzypce("Carlo Giordano", LocalDate.parse("2011-11-10"));
        Instrument int3= new Flet("Grand", LocalDate.parse("1999-11-10"));
        Instrument int4= new Fortepian("Steinway", LocalDate.parse("2007-11-10"));
        Instrument int5= new Fortepian("Kawai", LocalDate.parse("1987-11-10"));

        orkiestra.add(int1);
        orkiestra.add(int2);
        orkiestra.add(int3);
        orkiestra.add(int4);
        orkiestra.add(int5);

        for (Instrument p : orkiestra) {
            p.dzwiek();
        }
    }
}

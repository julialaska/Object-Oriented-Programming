package pl.imiajd.laska;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {

        ArrayList<Osoba> grupa = new ArrayList<>();
        Osoba osoba1 = new Osoba("Kowalski", LocalDate.parse("2017-11-10"));
        Osoba osoba2 = new Osoba("Kowalski", LocalDate.parse("2011-11-10"));
        Osoba osoba3 = new Osoba("Laska",  LocalDate.parse("2001-09-21"));
        Osoba osoba4 = new Osoba("Nowicki", LocalDate.parse("1987-11-10"));
        Osoba osoba5 = new Osoba("Kowal",  LocalDate.parse("1987-11-10"));
        grupa.add(osoba1);
        grupa.add(osoba2);
        grupa.add(osoba3);
        grupa.add(osoba4);
        grupa.add(osoba5);

//        grupa.forEach(System.out::print);

        for (Osoba o : grupa) {
            System.out.println(o);
        }

        Collections.sort(grupa);

        for (Osoba o : grupa) {
            System.out.println(o);
        }
    }

}

package lab7;

import pl.imiajd.laska.*;

public class zad2 {
    public static void main(String[] args)
    {

        Adres a1 = new Adres("Olsztynska",15,"Olsztyn","10-900");
        Adres a2 = new Adres("Olsztynska",15,"Olsztyn","10-800");
        System.out.println(a1.przed(a2));

        Osoba osoba1 = new Osoba("Kowalski", 1982);
        Osoba osoba2 = new Student("informatyka", "Nowak", 1999);
        Osoba osoba3 = new Nauczyciel(5000,"Zebrowski", 1968);
        System.out.println(osoba2.getNazwisko());
        System.out.println(((Nauczyciel) osoba3).getPensja());
        System.out.println(osoba3);

        BetterRectangle rect = new BetterRectangle(12,5,2,3);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

    }
}

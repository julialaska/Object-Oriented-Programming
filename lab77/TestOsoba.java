package pl.imiajd.laska;

import lab7.Osoba;
import lab7.Student;

public class TestOsoba
{
    public static void main(String[] args)
    {
        lab7.Osoba[] ludzie = new lab7.Osoba[2];

        ludzie[0] = new Pracownik("Jan Kowalski", 50000, new String[]{"Jan"}, 1983,5,12, false);
        ludzie[1] = new Student("Małgorzata Nowak", "informatyka",  new String[]{"Malgorzata", "Joanna"}, 2000, 2,8,true);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + " " + p.getDataUrodzenia() + ": " + p.getOpis());
        }
    }
}






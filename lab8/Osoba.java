package pl.imiajd.laska;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba> {
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Osoba(String nazwisko,LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
//        this.dataUrodzenia = LocalDate.of(year, month,day);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o){

        if (this.nazwisko.equals(o.nazwisko)) {
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }

         else {
             return this.nazwisko.compareTo(o.nazwisko);
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
//                "formatter=" + formatter +
                "[ nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia + "]" +
                '}';
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;
}
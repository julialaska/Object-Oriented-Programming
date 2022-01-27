package pl.imiajd.laska;

import java.time.LocalDate;

abstract class Osoba
{
    public Osoba(String nazwisko, String[] imiona, int year, int month, int day, boolean plec )
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = LocalDate.of(year, month,day);
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }

    private String nazwisko;
    String[] imiona;
    LocalDate dataUrodzenia;
    boolean plec;
}

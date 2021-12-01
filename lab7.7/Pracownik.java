package pl.imiajd.laska;

import java.time.LocalDate;

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, double pobory, String[] imiona, int year, int month, int day, boolean plec)
    {
        super(nazwisko, imiona, year, month, day, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = LocalDate.of(year, month,day);
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    private double pobory;
    LocalDate dataZatrudnienia;
}

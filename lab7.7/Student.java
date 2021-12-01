package pl.imiajd.laska;

class Student extends Osoba
{
    public Student(String nazwisko, String kierunek,  String[] imiona, int year, int month, int day, boolean plec)
    {
        super(nazwisko, imiona, year, month, day, plec);
        this.kierunek = kierunek;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;
    double sredniaOcen;


}

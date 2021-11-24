package pl.imiajd.laska;

public class Osoba {

    public Osoba(String nazwisko, double rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }

    String nazwisko;
    double rokUrodzenia;

}

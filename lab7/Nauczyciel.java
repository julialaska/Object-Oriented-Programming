package pl.imiajd.laska;

public class Nauczyciel extends Osoba {

    public Nauczyciel(double pensja,  String nazwisko,double rokUrodzenia){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
//        return "Nauczyciel{" +
//                "pensja=" + pensja +
//                ", nazwisko='" + nazwisko + '\'' +
//                ", rokUrodzenia=" + rokUrodzenia +
//                '}';
        return super.toString() + ", " + pensja;
    }

    double pensja;
}

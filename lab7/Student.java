package pl.imiajd.laska;

public class Student extends Osoba {

    public Student(String kierunek, String nazwisko,double rokUrodzenia){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "kierunek='" + kierunek + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }

    String kierunek;
}

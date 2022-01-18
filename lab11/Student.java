package lab11;

public class Student implements Comparable<Student> {
    private String nazwisko;
    private String ocena;
    private int id;

    public Student(String nazwisko, String ocena){
        this.nazwisko = nazwisko;
        this.ocena = ocena;
        this.id = id;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getOcena() {
        return ocena;
    }

    public void setOcena(String ocena) {
        this.ocena = ocena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nazwisko + ": " + ocena;
    }

    @Override
    public int compareTo(Student s) {
        return this.nazwisko.compareTo(s.nazwisko);
    }

}

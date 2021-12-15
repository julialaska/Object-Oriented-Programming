package pl.imiajd.laska;

import java.time.LocalDate;

class Student extends Osoba implements Cloneable, Comparable<Osoba> {

    public Student(String nazwisko, LocalDate dataUrodzenia) {
        super(nazwisko, dataUrodzenia);
    }


    public int compareTo(Student s){
        if (super.compareTo(s) == 0){
            if(this.sredniaOcen == s.sredniaOcen){
                return 0;
            }
        }
        return -1;
    }

    private double sredniaOcen;
}

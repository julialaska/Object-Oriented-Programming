package pl.imiajd.laska;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

public class TestStudent {

    public static void main(String[] args) {

        ArrayList<Student> grupa = new ArrayList<>();
        Student st1 = new Student("Kowalski", LocalDate.parse("2017-11-10"));
        Student st2 = new Student("Kowalski", LocalDate.parse("2011-11-10"));
        Student st3 = new Student("Laska", LocalDate.parse("2001-09-21"));
        Student st4 = new Student("Nowicki", LocalDate.parse("1987-11-10"));
        Student st5 = new Student("Kowal", LocalDate.parse("1987-11-10"));
        grupa.add(st1);
        grupa.add(st2);
        grupa.add(st3);
        grupa.add(st4);
        grupa.add(st5);

        for (Student o : grupa) {
            System.out.println(o);
        }

        System.out.println(st4.compareTo(st5));


        Collections.sort(grupa);

        for (Student s : grupa) {
            System.out.println(s);
        }

    }
}

package lab11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "";
        while(!str.equals("skoncz")){
            System.out.println("podaj czynnosc, zeby skonczyc napisz 'skoncz'");
            str = s.nextLine();
            if(str.equals("dodaj studenta"))
                Map.dodajStudenta();
            if(str.equals("usun studenta"))
                Map.usunStudenta();
            if(str.equals("zmien ocene"))
                Map.zmienOcene();
            if(str.equals("wypisz"))
                Map.wypisz();

        }
    }

public class Map{
    static HashMap<String, String> map = new HashMap<>();


    public static void dodajStudenta(){
        String nazwisko = podajNazwisko();
        String ocena = podajOcene();
        Student student = new Student(nazwisko,ocena);
        map.put(nazwisko,ocena);
    }
    public static void usunStudenta(){
//        String nazw = podajNazwisko();
//        map.remove(nazw);
        map.remove(podajNazwisko());
    }
    public static void zmienOcene(){
        String nazw = podajNazwisko();
        String ocena = podajOcene();
        map.replace(nazw,ocena);
    }
    public static void wypisz(){
        for(String k: map.keySet()){
            System.out.println(k + ": " + map.get(k));
        }
    }
    private static String podajNazwisko(){
        Scanner s = new Scanner((System.in));
        System.out.println("Podaj nazwisko");
        String nazw = s.nextLine();
        return nazw;
    }
    private static String podajOcene(){
        Scanner s = new Scanner((System.in));
        System.out.println("Podaj ocene");
        String ocena = s.nextLine();
        return ocena;
    }
}
}




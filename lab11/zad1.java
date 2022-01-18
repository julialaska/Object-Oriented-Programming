package lab11;

import java.io.Console;
import java.util.PriorityQueue;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = "";
        while(!str.equals("zakoncz")){
            System.out.println("podaj czynnosc, zeby skonczyc napisz 'zakoncz'");
            str = s.nextLine();
            if(str.equals("dodaj"))
                Queue.dodajZadanie();
            if(str.equals("nastepne"))
                Queue.usunZadanie();
            if(str.equals("wypisz"))
                Queue.wypisz();

        }
    }
}

class Queue{
    public static PriorityQueue<Zadanie> queue = new PriorityQueue<>();

    public static void dodajZadanie(){
        String opis = podajOpis();
        int prio = podajPriorytet();
        queue.add(new Zadanie(opis,prio));
    }
    public static void usunZadanie(){
        queue.poll();
    }
    public static void wypisz(){
        for(Zadanie x: queue){
            System.out.println(x.getPriorytet() + ": " + x.getOpis());
        }
    }
    private static String podajOpis(){
        Scanner s = new Scanner((System.in));
        System.out.println("Podaj opis");
        String opis = s.nextLine();
        return opis;
    }
    private static int podajPriorytet(){
        Scanner s = new Scanner((System.in));
        System.out.println("Podaj priorytet od 1 do 10");
        int prio = s.nextInt();

        return prio;
    }
}


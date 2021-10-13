import java.util.Scanner;
import java.util.ArrayList;

public class zad1pod2 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę");
            int liczba = scan.nextInt();
            lista.add(liczba);
//            System.out.println(lista.get(i));
        }


        int i = lista.set(0, n);
        int a = lista.set(n, 0);


        for (int j = 0; j < n; j++) {
            System.out.print(lista.get(j));
        }
    }
}
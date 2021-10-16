import java.util.Scanner;

public class zad2pod4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();

        int [] tab = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Podaj liczbę");
            tab[i] = scan.nextInt();
        }

        int max = tab[0];
        int min = tab[0];

        for(int i = 0; i < n; i++){
            if(tab[i] > max)
                max = tab[i];

        }

        for(int i = 0; i < n; i++){
            if(tab[i] < min)
                min = tab[i];

        }
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}
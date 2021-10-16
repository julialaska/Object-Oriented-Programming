import java.util.Scanner;

public class zad2pod5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę");
            tab[i] = scan.nextInt();
        }
        int licznik = 0;
        for(int i=0; i<n-1; i++) {
            if(tab[i]>0 & tab[i+1]>0)
                licznik++;
        }
        System.out.println(licznik);
    }
}
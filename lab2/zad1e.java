import java.util.Scanner;

public class zad1e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = scan.nextInt();
        int iloczyn = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę");
            int liczba = scan.nextInt();
            iloczyn *= Math.abs(liczba);
        }
        System.out.println(iloczyn);
    }
}

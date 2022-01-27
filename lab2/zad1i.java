import java.util.Scanner;

public class zad1i {
    public static int silnia(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        double suma=0;

        for(int i = 0; i < n; i++){
            System.out.println("Podaj liczbę");
            double liczba = scan.nextDouble();

            suma += (Math.pow((-1),i+1)*liczba)/silnia(i);

        }
        System.out.println(suma);

    }
}

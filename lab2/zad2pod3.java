import java.util.Scanner;

public class zad2pod3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        int licznik0 = 0;
        int licznikParz = 0;
        int licznikNieparz = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę");
            int liczba = scan.nextInt();
            if (liczba == 0){
                licznik0 += 1;
            }
            else if (liczba % 2 == 0){
                licznikParz += 1;
            }
            else {
                licznikNieparz += 1;
            }


        }
        System.out.println(licznik0);
        System.out.println(licznikParz);
        System.out.println(licznikNieparz);

    }
}

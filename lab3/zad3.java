import java.util.Scanner;
import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        System.out.println("Podaj m");
        int m = scan.nextInt();
        System.out.println("Podaj k");
        int k = scan.nextInt();

        if(n<=1 || n>=10 && m<=1 || m>=10 && k<=1 || k>=10) {
            do {
                System.out.println("Podaj nowe liczby");
                n = scan.nextInt();
                m = scan.nextInt();
                k = scan.nextInt();
            }
            while (n <= 1 && n >= 10 && m<=1 && m>=10 && k<=1 && k>=10);
        }

        int[][] tab = new int[m][n];
        int[][] tab2 = new int[n][k];
        int[][] tab3 = new int[m][k];

        generuj(tab,m,n,-999, 999);
        generuj(tab2,n,k, -999, 999);
        System.out.println("Macierz 1");
        wypisz(tab,m,n);
        System.out.println("Macierz 2");
        wypisz(tab2,n,k);
        pomnoz(tab,tab2,tab3,n,m,k);
        System.out.println("Macierz 3");
        wypisz(tab3,m,k);
    }
    public static void generuj(int[][] tab, int n,int m, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                tab[j][i] = r.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
            }
        }
    }
    public static void wypisz(int[][] tab, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
//                System.out.print("[" + i + "][" + j + "] = " + tab[i][j] +" ");
                System.out.print(tab[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void pomnoz(int[][] tab, int[][] tab2, int[][] tab3, int n, int m , int k){
        System.out.println("Macierze po pomnozeniu: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int l = 0; l< k;l++) {
                    tab3[i][l] += tab[i][j] * tab2[j][l];
                }
                }
            }
        }


}

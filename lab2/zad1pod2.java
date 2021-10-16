import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę");
            tab[i] = scan.nextInt();
        }

        int x = tab[0];

        int[] tab2 = new int[n];

        for(int j=1;j<n;j++){
            tab2[j-1] = tab[j];
        }

        tab2[n-1] = x;

        for(int k=0;k<n;k++) {
            System.out.print(tab2[k]);
        }

    }


}
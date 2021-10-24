import java.util.Scanner;
import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        if(n<=1 || n>=100) {
            do {
                System.out.println("Podaj nowe n");
                n = scan.nextInt();
            }
            while (n <= 1 && n >= 100);
        }

        int[] tab = new int[n];
        generuj(tab,n,-999,999);
        wypisz(tab);
        System.out.println("nieparzyste =  " + ileNieparzystych(tab));
        System.out.println("parzyste = " +ileParzystych(tab));
        System.out.println("dodatnich = " + ileDodatnich(tab));
        System.out.println("ujemne =  = " + ileUjemnych(tab));
        System.out.println("zerowych = " + ileZerowych(tab));
        System.out.println("maksymalna = " + Maksymalne(tab));
        System.out.println("ilosc maksymalnych = " + ileMaksymalnych(tab));
        System.out.println("suma dodatnich = " + sumaDodatnich(tab));
        System.out.println("suma ujemnyvh = " + sumaUjemnych(tab));
        System.out.println("dlugosc dod  = " + dlugoscMaksymalnegoCiaguDodatnich(tab));
        odwrocFragment(tab, 2, 6);
        wypisz(tab);
        signum(tab);
        wypisz(tab);


    }

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int j = 0; j < n; j++) {
            tab[j] = r.nextInt(maxWartosc-minWartosc + 1) + minWartosc;
        }
    }

    public static void wypisz(int[] tab) {
        for (int el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

    //    public static  int ileParzystych(int tab[]){
//        int licznik1 = 0;
//        for (int el : tab){
//            if(el % 2 == 0){
//                licznik1 +=1;
//            }
//        }
//        return licznik1;
//    }
//    public static  int ileNieparzystych(int tab[]){
//        int licznik = 0;
//        for (int el : tab){
//            if(el % 2 != 0){
//                licznik +=1;
//            }
//        }
//        return licznik;
//    }
    public static int ileParzystych(int tab[]){
        int licznik = 0;
        for(int i = 0; i < tab.length;i++){
            if(tab[i] % 2 == 0){
                licznik ++;
            }
        }
        return licznik;
    }
    public static int ileNieparzystych(int tab[]){
        int licznik = 0;
        for(int i = 0; i < tab.length;i++){
            if(tab[i] % 2 != 0){
                licznik ++;
            }
        }
        return licznik;
    }
    public static int ileDodatnich(int tab[]){
        int licznik = 0;
        for(int i = 0; i < tab.length;i++){
            if(tab[i] > 0){
                licznik ++;
            }
        }
        return licznik;
    }
    public static int ileUjemnych(int tab[]){
        int licznik = 0;
        for(int i = 0; i < tab.length;i++){
            if(tab[i] < 0){
                licznik ++;
            }
        }
        return licznik;
    }
    public static int ileZerowych(int tab[]){
        int licznik = 0;
        for(int i = 0; i < tab.length;i++){
            if(tab[i] == 0){
                licznik ++;
            }
        }
        return licznik;
    }
    public static int Maksymalne(int tab[]){
        int max = tab[0];
        for(int i = 0; i < tab.length;i++){
            if(tab[i] > max){
                max = tab[i];
            }
        }
        return max;
    }
    public static int ileMaksymalnych(int tab[]){
        int licznik = 0;
        for(int i = 0; i < tab.length;i++){
            if(tab[i] == Maksymalne(tab)){
                licznik ++;
            }
        }
        return licznik;
    }
    public static int sumaDodatnich(int tab[]){
        int suma = 0;
        for(int i = 0; i < tab.length;i++) {
            if (tab[i] > 0) {
                suma += tab[i];
            }
        }
        return suma;
    }
    public static int sumaUjemnych(int tab[]){
        int suma = 0;
        for(int i = 0; i < tab.length;i++) {
            if (tab[i] < 0){
                suma += tab[i];
            }
        }
        return suma;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]){
        int licznik = 0;
        int maks = tab.length;
        for(int i = 0; i < tab.length;i++) {
            if (tab[i] > 0){
                licznik +=1;
            }
            else if(licznik > maks){
                maks = licznik;
                licznik = 0;
            }
            else{
                licznik = 0;
            }

        }
        return licznik;
    }
    public static void signum(int tab[]){
        for(int i = 0; i < tab.length;i++) {
            if(tab[i] < 0)
                tab[i] = -1;
            else if(tab[i] > 0)
                tab[i] = 1;
            else if(tab[i] == 0)
                tab[i] = 0;
        }
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy){

        while(lewy<prawy){
            int pom = tab[lewy];
            tab[lewy] = tab[prawy];
            tab[prawy] = pom;

            lewy ++;
            prawy --;
        }
    }

}



package lab9;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtilBS {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] tablica = new Integer[10];
        for(int i=0; i<10; i++){
            tablica[i]=random.nextInt(10);
//            System.out.println(tablica[i]);
        }
        Arrays.sort(tablica);

        Integer element = 3;

        System.out.println(ArrayUtil_2.binSearch(tablica,element));
    }
}
class ArrayUtil_2<T>{
    public static <T extends Comparable<T>> int binSearch(T[] tab, T element){
//        Arrays.sort(tab);
        int min = 0;
        int max = tab.length-1;
        int indeks;
        while(min <= max){
            indeks = (min+max)/2;
            if(tab[indeks].compareTo(element) > 0){
                max = indeks++;
            }
            else if(tab[indeks].compareTo(element) < 0){
                min = indeks--;
            }
            else{
                return indeks;
            }
        }

        return -1;
    }
}

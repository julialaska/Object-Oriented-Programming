package lab9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtilDemo {
    public static void main(String[] args){
        Integer[] tab = new Integer[5];
        for( int i = 0; i<tab.length;i++){
            tab[i] = i+1;
            System.out.println(tab[i]);
        }

        Integer[] tab2 = new Integer[] {5,4,3,2,1};
        LocalDate[] tab3 = new LocalDate[3];
        LocalDate date1 = LocalDate.parse("2018-12-12");
        LocalDate date2 = LocalDate.parse("1999-02-19");
        LocalDate date3 = LocalDate.parse("2005-07-08");
        tab3[0] = date1;
        tab3[1] = date2;
        tab3[2] = date3;

//        Arrays.stream(tab3).sorted();


        if(ArrayUtil.isSorted(tab2) == -1){
            System.out.println("malejaco");
        }
        else{
            System.out.println("niemalejaco");
        }



    }
}

class ArrayUtil<T> {

    public ArrayUtil(T[] tab) {

    }

    public static <T extends Comparable<T>> int isSorted(T[] a){
        for(int i = 0; i < a.length + 1; i++){
            for(int j = i+1; j< a.length; j++){
                if(a[j].compareTo(a[i])<0){
                    return -1;
                }
                return 1;

            }
        }
        return 0;
    }
}
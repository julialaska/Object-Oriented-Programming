package Z1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class zad1 {
    public static void main(String[] args) {

        Character[] tab1 = {'b', 'c', 'b', 'a', 'c', 'a', 'd', 'f'};
        System.out.println(ArrayUtil.removeRepeatedElements(tab1));

        LocalDate[] tab2 = {LocalDate.of(2000,9,9), LocalDate.of(2000,9,9), LocalDate.of(2007,8,6), LocalDate.of(2314,3,2)};
        System.out.println(ArrayUtil.removeRepeatedElements(tab2));

    }
}
class ArrayUtil{
    public static <T extends Comparable<T>> ArrayList removeRepeatedElements(T[] tab){
        ArrayList<T> pom = new ArrayList<>();

        for(int i = 0; i< tab.length; i++){
            if(pom.contains(tab[i]))
                continue;
            else
                pom.add(tab[i]);
        }
        return  pom;
    }
}


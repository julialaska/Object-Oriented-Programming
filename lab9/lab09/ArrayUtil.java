package lab09;

import java.util.ArrayList;
import java.util.Collections;

class ArrayUtil<T> {

    public static <T extends Comparable<? super T >> boolean isSorted(ArrayList<T> tab){

        ArrayList<T> tab2 = new ArrayList<>(tab);
        Collections.sort(tab2);
        return tab2.equals(tab);
    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T element){

        ArrayList<T> tab2 = new ArrayList<>(tab);
        Collections.sort(tab2);

        int min = 0;
        int max = tab2.size()-1;
        int index = 0;

        while(min <= max){
            int mid = (min+max)/2;
            if(tab.get(mid).equals(element)){
                index = mid;
            }
            if(tab.get(mid).compareTo(element) > 0){
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }

        }
        return index;
    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab) {

        for (int i = 0; i < tab.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tab.size(); j++)
                if (tab.get(j).compareTo(tab.get(min)) < 0)
                    min = j;
            T temp = tab.get(min);
            tab.set(min, tab.get(i));
            tab.set(i, temp);

            
        }


    }


}
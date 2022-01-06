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
    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> tab) {
        if(tab.size() > 1){
            int mid = tab.size() / 2;

//            ArrayList<T> left = new ArrayList<>(tab.size() / 2);
//            ArrayList<T> right = new ArrayList<>(tab.size() - mid);
//
//            for(int i = 0; i < mid; i++) {
//
//                for (int j = mid; j < tab.size(); j++) {
//                    left.add(i, tab.get(i));
//                    right.add(j - mid, tab.get(j));
//
//                }
//            }

            // filling left section of tab
            ArrayList<T> left = new ArrayList<>(tab.size() / 2);
            for(int i = 0; i < mid; i++)
            {
                left.add(i, tab.get(i));
            }

            // filling right section of tab
            ArrayList<T> right = new ArrayList<>(tab.size() - mid);
            for(int i = mid; i < tab.size(); i++)
            {
                right.add(i - mid, tab.get(i));
            }

            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.size() && j < right.size())
            {
                if(left.get(i).compareTo(right.get(j)) < 0)
                {
                    tab.set(k, left.get(i));
                    i += 1;
                }
                else
                {
                    tab.set(k, right.get(j));
                    j += 1;
                }
                k += 1;
            }

            while(i < left.size())
            {
                tab.set(k, left.get(i));
                i += 1;
                k += 1;
            }
            while(j < right.size())
            {
                tab.set(k, right.get(j));
                j += 1;
                k += 1;
            }

        }
    }

}
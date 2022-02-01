package test.Z2;

import java.util.*;

public class zad2 {
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(5);
        tab1.add(4);
        tab1.add(3);
        tab1.add(3);
        tab1.add(6);
        tab1.add(2);
        tab1.add(1);
        tab1.add(12);
        printMarginal(tab1);

        LinkedList<Integer> tab2 = new LinkedList<>();
        tab2.add(1);
        tab2.add(2);
        tab2.add(3);
        tab2.add(4);
        tab2.add(6);
        tab2.add(0);
        printMarginal(tab2);

        TreeSet<Integer> tab3 = new TreeSet<>();
        tab3.add(9);
        tab3.add(8);
        tab3.add(7);
        tab3.add(6);
        printMarginal(tab3);

        LinkedHashSet<Integer> tab4 = new LinkedHashSet<>();
        tab4.add(3);
        tab4.add(1);
        tab4.add(8);
        tab4.add(6);
        printMarginal(tab4);
    }
    public static <E extends Iterable> void printMarginal(E obiekt){
        ArrayList<String> pom = new ArrayList<>();

        for(Object el: obiekt){
            pom.add(el.toString());
        }
        System.out.println("pierwszy el:" + pom.get(0) + ", ostatni el:" + pom.get(pom.size()-1));
    }
}



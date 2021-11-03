package lab5;

import java.util.ArrayList;
import java.util.Collections;

public class zad3 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println(mergeSorted(a,b));
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> nowa = new ArrayList<>();
        nowa.addAll(a);
        nowa.addAll(b);
        Collections.sort(nowa);
        return nowa;

    }
}

package lab5;

import java.util.ArrayList;

public class zad4 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        System.out.println(a);
System.out.println(a.get(3));
        ArrayList<Integer> b = new ArrayList<>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println(reversed(a));
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer>a){
        ArrayList<Integer> nowa = new ArrayList<>();
//        for(int i = 0; i < a.size(); i++) {
////            for(int j = a.size()-1; j>=0; j--) {
////                int el = a.get(j);
////                nowa.add(el);
////            }
////        }
//        return nowa;
        for(int j = a.size()-1; j>=0; j--) {
            Integer temp = a.get(j);
            nowa.add(temp);
        }
        return nowa;
    }
}

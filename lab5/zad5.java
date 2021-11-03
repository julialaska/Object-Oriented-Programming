package lab5;

import java.util.ArrayList;

public class zad5 {
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

        System.out.println(a);
        reverse(a);
        System.out.println(a);
    }
    public static void reverse(ArrayList<Integer>a){
//        for(int i = 0; i < a.size(); i++) {
//            for(int j = a.size()-1; j>=0; j--) {
//
//                a.set(i, a.get(j));
//            }
//        }
        for (int i = 0; i < a.size() / 2; i++) {
            Integer temp = a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, temp);
        }

        }
    }



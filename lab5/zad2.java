package lab5;

import java.util.ArrayList;

public class zad2 {
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

        System.out.println(merge(a,b));
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> nowa = new ArrayList<>();
//        if(a.size()<b.size()) {
//
//
//            for (int i = 0; i < (a.size()); i++) {
//                for (int j = 0; j < a.size(); j++) {
//                    if (i % 2 == 0) {
//
//                        nowa.add(a.get(j));
//                    } else {
//                        nowa.add(b.get(j-1));
//                    }
//                }
//            }
//        }
//        return nowa;
//    }
        for(int i =0; i < a.size();i++) {
            if (a.size() < b.size() || a.size() == b.size()) {
                nowa.add(a.get(i));
                nowa.add(b.get(i));
            }
        }
        b.subList(0,a.size()).clear();
        nowa.addAll(b);
        return nowa;
    }

}

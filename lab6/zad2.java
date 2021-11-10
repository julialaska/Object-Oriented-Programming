package lab6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class zad2 {
    public static void main(String[] args) {

        IntegerSet zbior = new IntegerSet();
        zbior.insertElement(4);
        zbior.insertElement(5);
        zbior.insertElement(6);
        zbior.deleteElement(4);

        IntegerSet zbior2 = new IntegerSet();
        zbior.insertElement(7);
        zbior.insertElement(8);

        System.out.println(zbior);
        System.out.println(zbior.union(zbior,zbior2));
    }
}

class IntegerSet{
    public IntegerSet(){
//        Set<Integer>set2 = new HashSet<>();
//        set2.add(5);
//        set2.add(8);
    }

    public void insertElement(Integer element){
        set.add(element);
    }

    public void deleteElement(Integer element){
        set.remove(element);
    }

    public static IntegerSet union(IntegerSet set, IntegerSet set2){
        IntegerSet union = new IntegerSet();
        for(int i =0;i<100;i++){
            union.insertElement(set[i]);
        }

        return union;
    }

    @Override
    public String toString() {
        return "IntegerSet{" +
                "set=" + set +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    Set<Integer>set = new HashSet<>();
}

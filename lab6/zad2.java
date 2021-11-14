package lab6;

import java.util.Arrays;
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

class IntegerSet {
    public IntegerSet(){
    }

    public static IntegerSet union(IntegerSet setA, IntegerSet setB)
    {
        IntegerSet pom = new IntegerSet();
        for(int i = 0; i < 101; i++)
        {
            pom.set[i] = setA.set[i] || setB.set[i];
        }
        return pom;
    }

    public static IntegerSet intersection(IntegerSet setA, IntegerSet setB)
    {
        IntegerSet pom = new IntegerSet();
        int i = 0;
        while(i < 101)
        {
            pom.set[i] = setA.set[i] && setB.set[i];
            i++;
        };

        return pom;
    }

    public void insertElement(int element)
    {
        set[element] = true;
    }

    public void deleteElement(int element)
    {
        set[element] = false;
    }

    @Override
    public String toString() {
        return "IntegerSet{" +
                "set=" + Arrays.toString(set) +
                '}';
    }

    public boolean isEqual(IntegerSet setA)
    {
        for(int i=0; i<101; i++)
        {
            if(set[i] != setA.set[i])
            {
                return false;
            }
        }
        return true;
    }

    private boolean[] set = new boolean[101];
}

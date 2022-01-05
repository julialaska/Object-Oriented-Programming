package lab09;

public class PairUtilDemo {

    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        PairUtil<String> mm = ArrayAlgUtil.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

//        mm.swap();
        PairUtil.swap(mm);

        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());
    }
}

class ArrayAlgUtil {

    public static PairUtil<String> minmax(String[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new PairUtil<> (min, max);
    }
}
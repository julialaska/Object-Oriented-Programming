package lab9;

public class PairDemoUtil {

    public static void main(String[] args)
    {
//        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = new Pair<>("Ala", "kot");
//        PairUtil<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        PairUtil.swap(mm);
//        mm.swap();

        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());
    }
}

//class ArrayAlg {
//
//    public static PairUtil<String> minmax(String[] a)
//    {
//        if (a == null || a.length == 0) {
//            return null;
//        }
//
//        String min = a[0];
//        String max = a[0];
//
//        for (int i = 1; i < a.length; i++) {
//            if (min.compareTo(a[i]) > 0) {
//                min = a[i];
//            }
//
//            if (max.compareTo(a[i]) < 0) {
//                max = a[i];
//            }
//        }
//
//        return new PairUtil<> (min, max);
//    }

class PairUtil<T> extends Pair {


    public PairUtil (T first, T second) {
        super(first, second);
    }

    public static <T> PairUtil <T> swap(Pair pair) {
        return new PairUtil<>((T) pair.getSecond(),(T) pair.getFirst());
    }

    private T first;
    private T second;
    }


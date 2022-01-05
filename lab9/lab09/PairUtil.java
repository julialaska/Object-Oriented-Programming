package lab09;

import lab09.Pair;

public class PairUtil<T> extends Pair {

    public PairUtil (T first, T second) {
       super(first, second);
    }

    public static <T> Pair <T> swap(Pair<T> pair) {
        pair.swap();
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    private T first;
    private T second;
}

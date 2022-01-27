import java.math.BigInteger;

public class zad4 {
    public static void main(String[] args) {
//        BigInteger first = new BigInteger("1");
//        BigInteger second = new BigInteger("987654321987654321987654321987");
//        BigInteger sum = first.add();
//        System.out.println("Suma " + sum.toString());
        System.out.println(suma(8));
    }
    public static BigInteger suma(int n){
        BigInteger pierwszy = new BigInteger("1");
        BigInteger drugi = new BigInteger("2");
        BigInteger sum = new BigInteger("0");
        BigInteger staly = new BigInteger("2");

        int m = n*n;

        for( int i = 0; i < m;i++){
            sum = sum.add(pierwszy);
            pierwszy = pierwszy.multiply(drugi);
        }
        return sum;
    }
}
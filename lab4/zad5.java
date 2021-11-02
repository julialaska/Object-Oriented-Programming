import java.math.BigDecimal;
import java.math.RoundingMode;

public class zad5 {
    public static void main(String[] args) {
        int n = 4;
        BigDecimal k = new BigDecimal("1000");
        BigDecimal p = new BigDecimal("0.17");

        System.out.println(kapital(k,p,n));
    }
    public static BigDecimal kapital(BigDecimal k, BigDecimal p,int n){
        BigDecimal kap = new BigDecimal("0");
        for(int i=0; i < n; i++){
            kap = kap.add(k);
            k = k.multiply(p);
        }
        kap = kap.setScale(2, RoundingMode.HALF_UP);
        return kap;
    }
}
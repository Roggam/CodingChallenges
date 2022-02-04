import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class SortBigDecimal {
    public static void main(String[] args) {
        String[] s = {"9",
                "-100",
                "50",
                "0",
                "56.6",
                "90",
                "0.12",
                ".12",
                "02.34",
                "000.000"};


        Arrays.sort(s, 0, s.length, new Comparator<Object>() {
            public int compare(Object a1, Object a2) {
                BigDecimal bigDec1 = new BigDecimal((String) a1);
                BigDecimal bigDec2 = new BigDecimal((String) a2);
                return bigDec2.compareTo(bigDec1);
            }
        });
        System.out.println(Arrays.toString(s));



    }
}

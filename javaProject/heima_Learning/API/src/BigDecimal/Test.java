package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        BigDecimal bg1 = new BigDecimal("0.01");
        BigDecimal bg2 = new BigDecimal("0.09");
        System.out.println(bg1.add(bg2));

        BigDecimal bg3 = BigDecimal.valueOf(10);
        BigDecimal bg4 = BigDecimal.valueOf(10.0);
        System.out.println(bg3 == bg4);
        BigDecimal bg5 = BigDecimal.valueOf(10);
        System.out.println(bg5 == bg3);

        BigDecimal bg6 = BigDecimal.valueOf(10);
        BigDecimal bg7 = BigDecimal.valueOf(3);
        System.out.println(bg6.divide(bg7, 10, RoundingMode.HALF_UP));

    }
}

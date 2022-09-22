package BigInteger;

import java.math.BigInteger;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            BigInteger bi = new BigInteger(4, new Random());
            System.out.println(bi);
        }

        System.out.println(Long.MAX_VALUE);
        System.out.println(BigInteger.valueOf(89999999));

    }
}

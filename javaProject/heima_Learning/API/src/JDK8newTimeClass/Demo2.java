package src.JDK8newTimeClass;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.ZoneId;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Instant.now());

        System.out.println(Instant.ofEpochMilli(0L));

        System.out.println(Instant.ofEpochSecond(1L));

        System.out.println(Instant.ofEpochSecond(1L, 1000000000L));

        System.out.println(Instant.now().atZone(ZoneId.of("Australia/Melbourne")));

        Instant ist1 = Instant.ofEpochMilli(0L);
        Instant ist2 = Instant.ofEpochMilli(10L);

        System.out.println(ist1.isBefore(ist2));
        System.out.println(ist1.isAfter(ist2));


        Instant instant = Instant.ofEpochMilli(0L);
        System.out.println(instant.minusSeconds(1000L));


    }
}

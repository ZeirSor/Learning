package src.JDK8newTimeClass;

import java.time.ZoneId;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
        System.out.println(ZoneId.systemDefault());

        System.out.println(ZoneId.of("Australia/Melbourne"));

    }
}

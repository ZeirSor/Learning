package src.time;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(0L);
        System.out.println(d2);

        d2.setTime(1000L);
        System.out.println(d2);

        long time = d2.getTime();
        System.out.println(time);

        Date d3 = new Date(0L);
        long time1 = d3.getTime();
        time1 += 1000L * 60 * 60 * 24 * 365;
        d3.setTime(time1);
        System.out.println(d3);


    }
}

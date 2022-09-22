package src.time;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        Random r = new Random();

        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));

        System.out.println(d1);
        System.out.println(d2);

        long time1 = d1.getTime();
        long time2 = d2.getTime();

        if (time1 > time2) {
            System.out.println("pre:1   post:2");
        }
        else if (time1 < time2) {
            System.out.println("pre:2  post:1");
        }else {
            System.out.println("time1 = = time2");
        }


    }
}

package multithreading_learning.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;

public class TimerDemo1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +
                        " execute AAA " + new Date());
            }
        }, 5000, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +
                        " execute BBB " + new Date());
                System.out.println(10 / 0);
            }
        }, 5000, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +
                        " execute CCC " + new Date());
            }
        }, 5000, 2000);
    }
}

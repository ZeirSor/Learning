package multithreading_learning.CreateMultiThread;

import org.junit.Test;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ' ' + i);
        }
    }

    @Test
    public void test() {
        Thread t = new MyThread();
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ' ' + i);
        }
    }

}





package multithreading_learning.CreateMultiThread;

import org.junit.Test;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ' ' + i);
        }
    }

    @Test
    public void test() {
        Runnable task = new MyRunnable();
        Thread th = new Thread(task);
        th.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ' ' + i);
        }
    }

    @Test
    public void anonymousMethod() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ' ' + i);
                }
            }
        };
        Thread th = new Thread(task);
        th.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ' ' + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ' ' + i);
            }
        }).start();


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ' ' + i);
        }
    }

}

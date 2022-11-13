package multithreading_learning.ThreadPool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " output: Hello world --> " + i);
        }
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                    " start to sleep.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
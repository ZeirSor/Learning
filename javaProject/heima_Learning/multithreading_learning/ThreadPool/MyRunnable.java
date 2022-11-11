package multithreading_learning.ThreadPool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " output: Hello world --> " + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() +
                    " start to sleep.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
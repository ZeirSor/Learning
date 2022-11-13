package multithreading_learning.ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        ExecutorService pool =
                new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(5),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.AbortPolicy());

        Future<String> future1 = pool.submit(new MyCallable(100));
        Future<String> future2 = pool.submit(new MyCallable(200));
        Future<String> future3 = pool.submit(new MyCallable(300));
        Future<String> future4 = pool.submit(new MyCallable(400));
        Future<String> future5 = pool.submit(new MyCallable(500));

        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
            System.out.println(future4.get());
            System.out.println(future5.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

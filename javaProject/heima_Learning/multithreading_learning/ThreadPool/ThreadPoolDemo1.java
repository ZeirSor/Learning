package multithreading_learning.ThreadPool;

import org.junit.Test;

import java.util.concurrent.*;

public class ThreadPoolDemo1 {

    public static void main(String[] args) {
//        create thread pool
//        public ThreadPoolExecutor(int corePoolSize,
//                                  int maximumPoolSize,
//                                  long keepAliveTime,
//                                  TimeUnit unit,
//                                  BlockingQueue<Runnable> workQueue,
//                                  ThreadFactory threadFactory,
//                                  RejectedExecutionHandler handler)
        ExecutorService pool =
                new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(5),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.AbortPolicy());
        // give task
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //queue
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //temporary
        pool.execute(target);
        pool.execute(target);

        //reject
        pool.execute(target);

        //close pool() ------ Generally not used in development
//        pool.shutdownNow();       //tasks will be lost
        pool.shutdown();        //wait for all tasks end then shutdown
    }
}

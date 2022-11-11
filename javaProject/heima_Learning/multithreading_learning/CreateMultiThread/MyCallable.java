package multithreading_learning.CreateMultiThread;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + " gets the result: " + sum;
    }

    public static void main(String[] args) {
        Callable<String> call = new MyCallable(200);
        FutureTask<String> task = new FutureTask<>(call);
        Thread th = new Thread(task);
        th.start();

        try {
            String s = task.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

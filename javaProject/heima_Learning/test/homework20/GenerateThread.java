package test.homework20;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GenerateThread implements Runnable {
    private int nums;
    boolean flag = true;
    int flag2 = 0;
    GenerateNumber gn = null;

    public GenerateThread(int nums, GenerateNumber gn) {
        this.nums = nums;
        this.gn = gn;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < nums; i++) {
            gn.generateUnrepeatNumber(10);
        }
        synchronized (this) {
            if (flag) {
                gn.getWin();
                flag = false;
            }
        }
    }

    public static void main(String[] args) {
        GenerateNumber gn = new GenerateNumber();
        Runnable gt = new GenerateThread(5, gn);
        Thread t1 = new Thread(gt);
        Thread t2 = new Thread(gt);

        t1.start();
        t2.start();
    }
}
package com.helloDemo;

import java.util.concurrent.ForkJoinPool;

public class Demo3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i / 10 == 7 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println("#############");
                continue;
            }
            System.out.println(i);
        }
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}

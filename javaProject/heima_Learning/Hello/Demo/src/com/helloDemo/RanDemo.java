package com.helloDemo;

import java.util.Random;

public class RanDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100) + 1;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

package com.helloDemo;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MyDevide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro = b;
        int res, mod;
        int p = 1;
        while(b <= a) {
            b += pro;
            p ++;
        }
        res = p - 1;
        mod = a - b + pro;
        System.out.println("a / b = " + res + " ··· " + mod);
        System.out.println(pro * res + mod);
    }
}

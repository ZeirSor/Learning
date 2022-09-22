package com.itheima.demo1;

import java.util.Scanner;

public class Demo2 {

    public static String getType(Object test) {
        return test.getClass().getName().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        while (x != 0) {
//            int p = x % 10;
//            System.out.println(p);
//            x /= 10;
//        }
//        byte b1 = 10;
//        byte b2 = 20;
//        int res1 = b1 + b2;
//        byte res2 = (byte) (b1 + b2);
//        //b1 + b2会自动转为int
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println((byte) (res1 + res2));
//        System.out.println("123" + 123);
//        System.out.println("123" + '1' + 23);
//        System.out.println(1 + 99 + "test");
//        System.out.println(3.7 + "abc");
//        System.out.println("abc" + true);
//        // 注意
//        System.out.println(1 + 2 + "abc" + 2 + 1);

//        char c = 'a';
//        int res = c + 2;
//        System.out.println(res);
//
//        System.out.println(1 + 'a');
//        System.out.println('a' + 1);

//        int a = 1;
//        System.out.println(a++);
//        a = 1;
//        System.out.println(++a);

//        System.out.println(getType(a));
//        System.out.println(getType(c));
//        System.out.println(getType(b1));

//        System.out.println(1 == 2);
//        System.out.println(1 == 1);
//        System.out.println(getType(1 == 2));
//
//        System.out.println(1 ^ 1);
//        System.out.println(1 ^ 4);  //?
//        System.out.println(0 ^ 0);
//        System.out.println(0 ^ 3);
//
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);

        //短路
        int a = 10;
        int b = 10;
        boolean res = ++a < 5 && ++b < 5;
        System.out.println(res);
        System.out.println(a);
        System.out.println(b);

        //对比非短路
        int a1 = 10;
        int b1 = 10;
        boolean res1 = ++a1 < 5 & ++b1 < 5;
        System.out.println(res1);
        System.out.println(a1);
        System.out.println(b1);


        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean resu = n1 % 6 == 0 || n2 % 6 == 0 || (n1 + n2) % 6 == 0;
        System.out.println(resu);

    }
}

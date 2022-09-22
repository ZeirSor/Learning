package com.helloDemo;

public class Method1 {
    public static void main(String[] args) {
        System.out.println(cmp(9, 4, 5, 6));
    }
 
    public static double getArea(double length, double width) {
        return length * width;
    }

    public static String cmp(double l1, double w1, double l2, double w2) {
        return getArea(l1, w1) > getArea(l2, w2) ? "1st" : "2nd";
    }
}

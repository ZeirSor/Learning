package com.helloDemo;

import org.w3c.dom.ls.LSResourceResolver;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pre =  sc.nextInt();
        int protext = pre;
        int post = 0;
        while (pre != 0) {
            int ge = pre % 10;
            pre /= 10;
            post = post * 10 + ge;
        }
        //System.out.println(post);
        if (protext == post)
            System.out.println("huiwen!");
        else System.out.println("not huiwen!");
    }
}

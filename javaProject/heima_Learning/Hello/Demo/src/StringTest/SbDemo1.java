package StringTest;

import java.util.Scanner;

public class SbDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String res = new StringBuilder(str).reverse().toString();

        if (str.equals(res)) System.out.println(1);
        else System.out.println(0);
    }
}

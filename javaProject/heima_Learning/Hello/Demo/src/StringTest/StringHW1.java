package StringTest;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class StringHW1 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            int random = new Random().nextInt(arr.length);
            arr[i] = arr[random];
            arr[random] = temp;
        }
        System.out.println(new String(arr));

        String str2 = new Scanner(System.in).nextLine();
        System.out.println(str2);
        for (int length = str2.length() - 1, count = 0; length >= 0; length--) {
            if (str2.charAt(length) != ' ')
                count++;
            else {
                System.out.println(count);
                break;
            }
        }
    }
}

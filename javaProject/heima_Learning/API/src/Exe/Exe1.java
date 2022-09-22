package src.Exe;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please enter an integer:");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);

            if (num < 1 || num > 100) {
                System.out.println("error");
                continue;
            }

            list.add(num);

            int sum = getSum(list);
            if (sum > 200) {
                System.out.println("stop!!!!!!");
                break;
            }
        }

        for (Integer integer : list) {
            System.out.printf("%d ", integer);
        }

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        return sum;
    }
}

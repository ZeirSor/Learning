package com.helloDemo;

import java.time.chrono.IsoEra;
import java.util.Random;
import java.util.Scanner;

public class DoubleBall {

    public static void main(String[] args) {
        printRule();
        int[] ranNum = grtRanNum();
        printRanNum(ranNum);
        System.out.println();
        int[] user = userInput();
        countAndJudge(ranNum, user);
    }

    public static void printRanNum(int[] ranNum) {
        System.out.print("生成的投注号码为:");
        for (int i = 0; i < ranNum.length; i++) {
            System.out.print(ranNum[i] + " ");
        }
    }

    public static void printRule() {
        System.out.println("********************双色球********************");
        System.out.println("规则：");
        System.out.println("    投注号码由6个红色球号码和1个蓝色球号码组成。");
        System.out.println("    红色球号码从1—33中选择﹔");
        System.out.println("    蓝色球号码从1—16中选择。");
        System.out.println("一等奖：最高1000万         6红   +   1蓝");
        System.out.println("二等奖：最高500万          6红   +   0蓝");
        System.out.println("三等奖：最高3000元         5红   +   0/1蓝");
        System.out.println("四等奖：最高200元          4红   +   0/1蓝");
        System.out.println("五等奖：最高10万           3/2红 +   1蓝");
        System.out.println("六等奖：最高5元            1/0红 +   1蓝");
        System.out.println("*********************************************");
        System.out.println("请依次输入6个红球号码和1个蓝球号码：");
    }

    public static void countAndJudge(int[] ranNum, int[] user) {
        int redNum = 0, blueNum = 0;
        for (int i = 0; i < user.length - 1; i++) {
            for (int j = 0; j < ranNum.length - 1; j++) {
                if (ranNum[j] == user[i])
                    redNum++;
            }
        }
        if (ranNum[ranNum.length - 1] == user[user.length - 1])
            blueNum++;

        Random r = new Random();
        if (redNum == 6 && blueNum == 1) {
            double reward = r.nextDouble(500, 1000);
            System.out.println("恭喜你，中奖" + reward + "万");
        } else if (redNum == 6 && blueNum == 0) {
            double reward = r.nextDouble(0.3, 500);
            System.out.println("恭喜你，中奖" + ((double) reward / 1000) + "万");
        } else if (redNum == 5 && (blueNum == 0 || blueNum == 1)) {
            double reward = r.nextDouble(200, 3000);
            System.out.println("恭喜你，中奖" + reward + "元");
        } else if (redNum == 4 && (blueNum == 0 || blueNum == 1)) {
            double reward = r.nextDouble(10, 200);
            System.out.println("恭喜你，中奖" + reward + "元");
        } else if ((redNum == 3 || redNum == 2) && blueNum == 1) {
            double reward = r.nextDouble(5, 10);
            System.out.println("恭喜你，中奖" + reward + "元");
        } else if ((redNum == 1 || redNum == 0) && blueNum == 1) {
            double reward = r.nextDouble(0, 5);
            System.out.println("恭喜你，中奖" + reward + "元");
        } else System.out.println("谢谢参与");

    }

    public static int[] userInput() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号");
            int input = sc.nextInt();
            if (input >= 1 && input <= 33) {
                if (!ifContain(arr, input)) {
                    arr[i] = input;
                    i++;
                } else System.out.println("红球号码有重复，请重新输入！");
            } else System.out.println("当前红球号码超出范围，请重新输入！");
        }

        System.out.println("请输入蓝球号");
        int input = sc.nextInt();
        if (input >= 1 && input <= 16)
            arr[6] = input;
        else System.out.println("当前蓝球号码超出范围，请重新输入！");

        return arr;
    }

    public static int[] grtRanNum() {
        Random r = new Random();
        int[] ranNum = new int[7];
        for (int i = 0; i < ranNum.length - 1; ) {
            int ran = r.nextInt(33) + 1;
            if (!ifContain(ranNum, ran)) {
                ranNum[i] = ran;
                i++;
            }
        }
        ranNum[6] = r.nextInt(16) + 1;
        return ranNum;
    }

    public static boolean ifContain(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num)
                return true;
        return false;
    }
}

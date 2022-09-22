import java.util.Scanner;

public class ThreeCodeDemo {
    public static void main(String[] args) {
        int a = 300;
        //0000 0000 0000 0000 0000 0001 0010 1100
        byte b = (byte) a;
        //0010 1100 被截断
        System.out.println(b);
        //44

        System.out.println();
        int a1 = 200;
        //0000 0000 0000 0000 0000 0000 1100 1000
        byte b1 = (byte) a1;
        //1100 1000(补) --> 1100 0111(反) --> 1011 1000(原) --> -56
        System.out.println(b1);
        //-56

        String str = "hanzi";

        switch (str) {
            case "hanzi":
                System.out.println(str);
            case "32r":
                System.out.println("%%%");
            default:
                break;
        }

        // switch 新特性
        // JDK12
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 4 -> System.out.println("四");
            case 8 -> System.out.println("八");
            case 16 -> System.out.println("十六");
            default -> System.out.println("没有！");
        }

        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息！");
            default -> System.out.println("输入错误！");
        }

    }
}

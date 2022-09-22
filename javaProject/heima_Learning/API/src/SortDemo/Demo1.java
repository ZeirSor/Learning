package src.SortDemo;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        Stu[] s = new Stu[5];
        s[0] = new Stu(5);
        s[1] = new Stu(9);
        s[2] = new Stu(2);
        s[3] = new Stu(18);
        s[4] = new Stu(6);

        for (Stu x : s) {
            System.out.print(x.getAge() + " ");
        }
        System.out.println();

        Arrays.sort(s, ((o1, o2) -> (o1.getAge() - o2.getAge())));

        for (Stu x : s) {
            System.out.print(x.getAge() + " ");
        }
        System.out.println();
    }
}

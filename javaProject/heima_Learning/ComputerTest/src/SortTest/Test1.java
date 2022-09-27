package SortTest;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[] s = new Student[5];

        s[0] = new Student("zhangsan", 18);
        s[1] = new Student("lisi", 15);
        s[2] = new Student("wangwu", 20);
        s[3] = new Student("zhaoliu", 19);
        s[4] = new Student("yuqi", 5);

        Arrays.sort(s);

        for (Student student : s) {
            System.out.println(student);
        }

        
    }
}

package ArrayListDemo;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("zhaowu", 17);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(new Student("wangliu", 20));

        int age = list.get(2).getAge();

        System.out.println(list);
    }
}

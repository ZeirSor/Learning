package HashSetDemo;

import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 18);
        Student s4 = new Student("zhangsan", 23);

        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);

        for (Student h : hs) {
            System.out.println(h);
        }

        hs.forEach(student -> System.out.println(student.toString()));
    }
}

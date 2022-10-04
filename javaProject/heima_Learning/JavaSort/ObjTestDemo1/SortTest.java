package JavaSort.ObjTestDemo1;

import java.util.*;

public class SortTest {
    public static void main(String[] args) {
        Student[] s1 = {
                new Student("zhangsan", 19),
                new Student("lisi", 15),
                new Student("wangwu", 22),
                new Student("zhaoliu", 16),
                new Student("yuqi", 20),
        };

        Student[] s2 = Arrays.copyOf(s1, s1.length);

        Student[] temp = Arrays.copyOf(s1, s1.length);

        for (Student student : s1) {
            System.out.println(student);
        }

        System.out.println("----------array sort test---------");
        System.out.println("------------comparator------------");

        Arrays.sort(s1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        for (Student student : s1) {
            System.out.println(student);
        }

        System.out.println("------------comparable------------");
        Arrays.sort(s2);
        for (Student student : s2) {
            System.out.println(student);
        }

        System.out.println("----------list sort test---------");
        ArrayList<Student> list = new ArrayList<>();
        for (Student student : temp) {
            list.add(student);
        }
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

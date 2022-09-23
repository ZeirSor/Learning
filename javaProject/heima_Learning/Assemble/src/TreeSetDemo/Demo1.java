package TreeSetDemo;

import com.sun.source.tree.NewArrayTree;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Demo1 {
    public static void main01(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(2);
        ts.add(5);
        ts.add(1);
        ts.add(3);

        System.out.println(ts);

        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("--------------------------");

        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }
        System.out.println("--------------------------");

        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("--------------------------");

        ts.forEach(integer -> System.out.println(integer));
    }

    public static void main(String[] args) {
//        Student s1 = new Student("zhangsan", 19);
//        Student s2 = new Student("zhangsan1", 18);
//        Student s3 = new Student("zhangsan2", 20);
//
//        TreeSet<Student> ts = new TreeSet();
//
//        ts.add(s3);
//        ts.add(s2);
//        ts.add(s1);
//
//        System.out.println(ts);

    }
}

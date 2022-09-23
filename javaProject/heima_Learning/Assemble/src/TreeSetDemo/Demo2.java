package TreeSetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo2 {
    public static void main01(String[] args) {
//        TreeSet)对象排序练习题
//        需求：请自行选择比较器排序和自然排序两种方式；
//        要求：存入四个字符串，“c”",“ab”,“df”,“qwer"
//        按照长度排序，如果一样长则按照首字母排序
        // o1是当前要添加的元素
        // o2是已经在红黑树存在的元素
        // 返回值规则同之前
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照长度进行排序
                int i = o1.length() - o2.length();
                //如果长度一样则按照首字母排序
                //这里的compareTo是默认的比较规则
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }

    public static void main02(String[] args) {
        //lambda表达式写法
        TreeSet<String> ts = new TreeSet<>(
                (o1, o2) -> o1.length() - o2.length() == 0 ?
                        o1.compareTo(o2) : o1.length() - o2.length()
        );

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }

//    1.如果想要集合中的元素可重复
//      ●用ArrayList集合，基于数组的。（用的最多）
//    2.如果想要集合中的元素可重复，而且当前的增删操作明显多于查询
//      ●用LinkedList集合，基于链表的。
//    3.如果想对集合中的元素去重
//      ●用HashSet:集合，基于哈希表的。（用的最多）
//    4.如果想对集合中的元素去重，而且保证存取顺序
//      ●用LinkedHashSet集合，基于哈希表和双链表，效率低于HashSet。
//    5.如果想对集合中的元素进行排序
//      ●用TreeSet集合，基于红黑树。后续也可以用List集合实现排序。

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23, 90, 99, 50);
        Student s2 = new Student("lisi", 24, 90, 98, 50);
        Student s3 = new Student("wangwu", 25, 95, 100, 30);
        Student s4 = new Student("zhaoliu", 26, 60, 99, 70);
        Student s5 = new Student("linqi", 26, 70, 80, 70);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        ts.forEach(student -> {
            System.out.println(student.getSum());
            System.out.println(student);
        });
    }
}

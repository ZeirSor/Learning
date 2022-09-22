package List;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            String str = ite.next();
            System.out.println(str);
        }
        System.out.println("---------------------");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("---------------------");

        list.forEach(s -> System.out.println(s));
        System.out.println("---------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");

        //列表迭代器
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String str = it.next();
            //list迭代器另外添加了一个方法：在遍历过程中可以添加元素
            if ("bbb".equals(str)) {
                it.add("qqq");
            }
            System.out.println(str);
        }
        System.out.println("---------------------");


    }
}

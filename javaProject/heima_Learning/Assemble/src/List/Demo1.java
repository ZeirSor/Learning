package List;

import jdk.dynalink.support.AbstractRelinkableCallSite;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        Integer res1 = list.remove(2);
        System.out.println(res1);
        System.out.println(list);

        Integer res2 = list.set(1, 24);
        System.out.println(res2);
        System.out.println(list);

        Integer i = 1;

        list.remove(i);
        System.out.println(list);

        Integer res3 = list.get(1);
        System.out.println(res3);
    }
}

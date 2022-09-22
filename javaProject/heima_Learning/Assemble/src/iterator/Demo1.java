package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("111");
        coll.add("222");
        coll.add("333");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        coll.forEach(s -> System.out.println(s));
    }
}

package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class HashMapDemp2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("three", 3);
        map.put("two", 2);
        map.put("four", 4);

//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            Integer value = map.get(key);
//            System.out.println(key + " = " + value);
//        }

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("------------------------");

        map.keySet().forEach(new Consumer<String>() {
            @Override
            public void accept(String key) {
                System.out.println(key + " = " + map.get(key));
            }
        });

        System.out.println("------------------------");

        map.keySet().forEach(
                key -> System.out.println(key + " = " + map.get(key))
        );

        System.out.println("------------------------");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println("------------------------");

        Iterator<Map.Entry<String, Integer>> iterator_entry = map.entrySet().iterator();
        while (iterator_entry.hasNext()) {
            Map.Entry<String, Integer> entry = iterator_entry.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println("------------------------");

        map.entrySet().forEach(new Consumer<Map.Entry<String, Integer>>() {
            @Override
            public void accept(Map.Entry<String, Integer> stringIntegerEntry) {
                System.out.println(stringIntegerEntry.getKey() + " = " + stringIntegerEntry.getValue());
            }
        });

        System.out.println("------------------------");

        map.entrySet().forEach(
                entry -> System.out.println(entry.getKey() + " = " + entry.getValue())
        );

        System.out.println("------------------------");

        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + " = " + value);
            }
        });

        System.out.println("------------------------");

        map.forEach(
                (key, value) -> System.out.println(key + value)
        );

    }
}

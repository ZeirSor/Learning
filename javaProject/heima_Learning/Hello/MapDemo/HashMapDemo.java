package Hello.MapDemo;

import java.security.DrbgParameters;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put("aa", 123);
        map.put(78, 123);
        map.put("sd", 234);

        System.out.println(map);

        for (Object o : map.keySet()) {
            System.out.println(o);
        }

        Set<Object> set = map.keySet();
        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collection<Object> values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }

        //traverse1
        Set eSet = map.entrySet();
        Iterator eIt = eSet.iterator();
        while (eIt.hasNext()) {
            Object key = eIt.next();
            Map.Entry ent = (Map.Entry) key;
            System.out.println(ent.getKey() + "---->" + ent.getValue());
        }
        System.out.println("----------------------");

        //traverse2
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + "---->" + value);
        }
    }
}

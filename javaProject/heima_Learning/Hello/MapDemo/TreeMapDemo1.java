package Hello.MapDemo;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        String test = "aacbbdddccbceebcbaaacbde";

        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < test.length(); i++) {
            char get_char = test.charAt(i);
            if (tm.containsKey(get_char)) tm.put(get_char, tm.get(get_char) + 1);
            else tm.put(get_char, 1);
        }
        System.out.println(tm);

        StringBuilder sb = new StringBuilder();

        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
                sb.append(character).append("(").append(integer).append(")").append(" ");
            }
        });

        System.out.println(sb);
    }
}

package Hello.MapDemo;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

public class HashMapExe1 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
//            System.out.println(arr[index]);
        }

        HashMap<String, Integer> hm = new HashMap<>();
        for (String scenic : list) {
            if (hm.containsKey(scenic)) {
                int count = hm.get(scenic);
                count++;
                hm.put(scenic, count);
            } else {
                hm.put(scenic, 1);
            }
        }

        System.out.println(hm);

        int max = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : hm.entrySet()) {
            if (stringIntegerEntry.getValue() > max) {
                max = stringIntegerEntry.getValue();
            }
        }

        System.out.println(max);

        for (String s : hm.keySet()) {
            if (hm.get(s) == max) {
                System.out.println(s);
            }
        }

    }
}

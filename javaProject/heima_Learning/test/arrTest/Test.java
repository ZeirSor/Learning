package test.arrTest;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() {{
            add(0);
            add(0);
        }};
        System.out.println(list);
    }
}

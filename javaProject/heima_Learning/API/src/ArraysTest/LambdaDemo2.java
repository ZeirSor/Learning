package src.ArraysTest;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("Swimming~~~");
            }
        });

        method(() -> {
            System.out.println("swimming~~~");
        });

        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};
        Arrays.sort(arr, ((o1, o2) -> o2 - o1));
        System.out.println(Arrays.toString(arr));

    }

    public static void method(Swim s) {
        s.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
//    public abstract void swim2();
}


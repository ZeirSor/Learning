package oi_OuterInerClass;

public class Test2 {
    public static void main(String[] args) {

        outer:
        {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        System.out.println(i + " " + j + " " + k);
                        if (i == 2 && j == 2 && k == 2) {
                            break outer;
                        }
                    }
                }
            }
        }
    }
}

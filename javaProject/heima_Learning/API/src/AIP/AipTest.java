package AIP;

public class AipTest {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder s2 = new StringBuilder("abc");

        System.out.println(s.equals(s2));   //false
        System.out.println(s2.equals(s));   //false


    }
}

package src.reptile;

public class RepileTest7 {
    public static void main(String[] args) {
        String s = "我要要要要要要要学学学学JJJJJJJJaaaaavvvvaaaaaaaaaaaaaaaaaa";
        System.out.println(s.replaceAll("(.)\\1+", "$1"));
    }
}

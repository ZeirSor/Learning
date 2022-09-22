package RegularExpression;

public class Test1 {
    public static void main(String[] args) {
        String qq1 = "12345678a";
        String qq2 = "012345678";
        String qq3 = "12345678";
        System.out.println(qq1.matches("[1-9]\\d{5,19}"));
        System.out.println(qq2.matches("[1-9]\\d{5,19}"));
        System.out.println(qq3.matches("[1-9]\\d{5,19}"));

    }
}

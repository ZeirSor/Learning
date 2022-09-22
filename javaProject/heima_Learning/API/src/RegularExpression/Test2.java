package src.RegularExpression;

public class Test2 {
    public static void main(String[] args) {
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("18818944595".matches(regex1));
        System.out.println("1418681573".matches(regex1));
        System.out.println("12345678900".matches(regex1));
        System.out.println("13694857437".matches(regex1));
        System.out.println("--------------------------------");

        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("0755-8888878".matches(regex2));
        System.out.println("010-8888878".matches(regex2));
        System.out.println("075-8888878".matches(regex2));
        System.out.println("05-8888878".matches(regex2));
        System.out.println("0755-8888888327467346778".matches(regex2));
        System.out.println("--------------------------------");

        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("1418681573@qq.com".matches(regex3));
        System.out.println("Szpsn2357@163.com".matches(regex3));
        System.out.println("120211080526@ncepu.edu.cn".matches(regex3));
        System.out.println("--------------------------------");

        String regex4 = "(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("22:36:34".matches(regex4));
    }
}

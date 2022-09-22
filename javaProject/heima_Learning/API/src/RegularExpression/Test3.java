package src.RegularExpression;

public class Test3 {
    public static void main(String[] args) {
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("--------------------------------");

        //身份证简单校验
        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        System.out.println("123456789098765432".matches(regex2));
        System.out.println("12345678909876543x".matches(regex2));
        System.out.println("12345678909876543X".matches(regex2));
        System.out.println("1234567890987654333".matches(regex2));
        System.out.println("--------------------------------");

        //忽略大小写
        String regex3 = "a((?i)b)c";
        System.out.println("AbC".matches(regex3));
        System.out.println("abC".matches(regex3));
        System.out.println("abc".matches(regex3));
        System.out.println("aBc".matches(regex3));
        System.out.println("--------------------------------");

        //身份证简单校验2
        String regex4 = "[1-9]\\d{16}[\\dXx]";
        String regex5 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("123456789098765432".matches(regex4));
        System.out.println("12345678909876543x".matches(regex4));
        System.out.println("12345678909876543X".matches(regex4));
        System.out.println("--------------------------------");
        System.out.println("123456789098765432".matches(regex5));
        System.out.println("12345678909876543x".matches(regex5));
        System.out.println("12345678909876543X".matches(regex5));
        System.out.println("--------------------------------");

        System.out.println("modify! --gitee");

    }
}

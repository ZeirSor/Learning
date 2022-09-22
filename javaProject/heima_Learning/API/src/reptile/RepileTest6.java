package src.reptile;

public class RepileTest6 {
    public static void main(String[] args) {
//        捕获分组就是把这一组的数据捕获出来，再用一次。
//        需求1∶判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
//        举例:     a123a b456b 17891 &abc& a123b(false)

        //  \\组号：表示把第x组的数据拿出来再用一次
        String regex1 = "(.).+\\1";
        String[] s1 = {"a123a", "b456b", "17891", "&abc&", "a123b"};
        for (String x: s1)
            System.out.println(x.matches(regex1));
        System.out.println("--------------------------");

//        需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
//        举例:     abc123abc b456b 123789123 &!@abc&!@
        String regex2 = "(.+).+\\1";
        String[] s2 = {"abc123abc", "b456b", "123789123", "&!@abc&!@", "a123b"};
        for (String x: s2)
            System.out.println(x.matches(regex2));
        System.out.println("--------------------------");

//        需求3:判断一个字符串的开始部分和结束部分是否一致﹖开始部分内部每个字符也需要一致
//        举例: aaa123aaa bbb456bbb 111789111 &&abc&&
        String regex3 = "((.+)\\2*).+\\1";
        String[] s3 = {"aaa123aaa", "bbb456bbb", "111789111", "&&abc&&", "aa123bab"};
        for (String x: s3)
            System.out.println(x.matches(regex3));
        System.out.println("--------------------------");


    }
}

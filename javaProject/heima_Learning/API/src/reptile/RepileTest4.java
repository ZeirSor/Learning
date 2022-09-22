package src.reptile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepileTest4 {
    public static void main(String[] args) {
        //贪婪匹配和非贪婪匹配

        //贪婪：尽可能多获取数据

        //非贪婪：尽可能少获取数据
        //在 * + 后面加上 ? 就是非贪婪爬取

        //Java中默认贪婪爬取

        String s = "aabbbbbbbbbbbbbbbbbbbaaaaaaa";

        String regex1 = "ab+";
        repile(s, regex1);

        String regex2 = "ab+?";
        repile(s, regex2);


    }

    public static void repile(String s, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            System.out.println(m.group());
        System.out.println("--------------------------------------");
    }
}

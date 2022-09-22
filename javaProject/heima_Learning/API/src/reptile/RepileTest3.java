package src.reptile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepileTest3 {
    public static void main(String[] args) {
        String s = "java自从95年问世以来，经历了很多版木，目前企业中用的最多的是JAva8和JaVa11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是JavA17，相信在未来不久jAVa17也会逐渐登上历史舞台";

        //爬取带版本的java 但不要输出java版本号
        String regex1 = "((?i)Java)(?=8|11|17)";
        repile(s, regex1);
        System.out.println("---------------------");

        //带版本的并输出
        String regex2 = "((?i)Java)(8|11|17)";
        repile(s, regex2);
        System.out.println("---------------------");
        String regex3 = "((?i)Java)(?:8|11|17)";
        repile(s, regex3);
        System.out.println("---------------------");

        //不要带版本的
        String regex4 = "((?i)Java)(?!8|11|17)";
        repile(s, regex4);

    }

    public static void repile(String s, String regex) {
        //获取正则表达式对象
        Pattern p = Pattern.compile(regex);
        //获取文本匹配器对象     m要在str中找符合规则p的对象
        Matcher m = p.matcher(s);
        //fing()有就true 否则false  底层会记录子串起始索引和结束索引 + 1
        while (m.find())
            //根据索引进行字符串的截取
            System.out.println(m.group());
    }
}

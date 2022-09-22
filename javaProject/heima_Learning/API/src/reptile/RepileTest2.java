package src.reptile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepileTest2 {
    public static void main(String[] args) {
        String str = "需求:把下面文本中的座机电话，邮箱，手机号，热线都爬取出来。\n" +
                "        来黑马程序员学习Java,\n" +
                "                手机号:18512516758，18512508907或者联系邮箱: boniu@itcast.cn，\n" +
                "        座机电话: e1036517895，010-98951256邮箱: bozai@itcast.cn,\n" +
                "        热线电话: 400-618-9090 , 408-618-40ee，40861840日日，400618909e";

        String regex = "(1[3-9]\\d{9})" +
                "|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|(0\\d{2,3}-?[1-9]\\d{4,9})" +
                "|(400-?[1-9]\\d{2}-?[1-9]{3})";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(str);

        while (m.find())
            System.out.println(m.group());
    }
}

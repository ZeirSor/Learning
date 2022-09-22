package src.reptile;

//文本匹配器     在大串中找符合规则的子串
import java.util.regex.Matcher;

//表示正则表达式
import java.util.regex.Pattern;


public class ReptileTest1 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版木，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //获取正则表达式对象
        Pattern p = Pattern.compile("Java\\d{0,2}");

        //获取文本匹配器对象
        //m要在str中找符合规则p的对象
        Matcher m = p.matcher(str);

        //有就true 否则false
        //底层会记录子串起始索引和结束索引 + 1
        boolean b = m.find();
        System.out.println(b);

        //根据索引进行字符串的截取
        String s = m.group();
        System.out.println(s);

        //后面调用find时会继续读取后面的内容
        //并且group会根据find记录的索引再次截取字符串
        while(m.find()) {
            System.out.println(m.group());
        }


    }
}

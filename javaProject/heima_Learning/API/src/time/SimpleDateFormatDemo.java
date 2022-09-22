package src.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

    public static void main(String[] args) throws ParseException {
//        秒杀活动: 2023年11月11日 0:0:0（毫秒值)
//        开始时间:2023年11月11日 0:10:0（毫秒值)
//        小贾下单并付款的时间为:2023年11月11日 0:01:00
//        小皮下单并付款的时间为:2023年11月11日 0:11:0
//        用代码说明这两位同学有没有参加上秒杀活动?

        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr1 = "2023年11月11日 0:01:00";
        String orderStr2 = "2023年11月11日 0:11:0";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate1 = sdf.parse(orderStr1);
        Date orderDate2 = sdf.parse(orderStr2);

        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime1 = orderDate1.getTime();
        long orderTime2 = orderDate2.getTime();

        if (orderTime1 >= startTime && orderTime1 <= endTime) {
            System.out.println("1: success");
        } else System.out.println("1: fail");

        if (orderTime2 >= startTime && orderTime2 <= endTime) {
            System.out.println("2: success");
        } else System.out.println("2: fail");


    }

    public static void method3() throws ParseException {

        String str = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str2 = sdf2.format(date);
        System.out.println(str2);

    }

    public static void method2() throws ParseException {
        String str = "2022-9-3 15:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
        System.out.println(date.getTime());


    }

    public static void method1() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String s1 = sdf.format(d1);
        System.out.println(s1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String s2 = sdf2.format(d1);
        System.out.println(s2);



    }
}

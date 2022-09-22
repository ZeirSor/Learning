package src.calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(0L));
        System.out.println(c);
        System.out.println(c.getTime());

        System.out.println(c.getTimeInMillis());
        c.setTimeInMillis(123456567);
        System.out.println(c.getTimeInMillis());

        c.set(Calendar.YEAR, 2022);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DATE, 2);

        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, 1);
        c.add(Calendar.DATE, 1);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + ", " + month + ", " + date + ", " + getWeek(week));



    }

    public static String getWeek(int index) {
        String[] week = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return week[index];
    }
}

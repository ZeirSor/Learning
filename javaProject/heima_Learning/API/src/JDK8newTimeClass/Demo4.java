package src.JDK8newTimeClass;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Demo4 {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthDay = LocalDateTime.of(2003, 3, 6, 20, 0, 0);

        System.out.println("相差年数: " + ChronoUnit.YEARS.between(birthDay, today));
        System.out.println("相差月数: " + ChronoUnit.MONTHS.between(birthDay, today));
        System.out.println("相差周数: " + ChronoUnit.WEEKS.between(birthDay, today));
        System.out.println("相差天数: " + ChronoUnit.DAYS.between(birthDay, today));
        System.out.println("相差时数: " + ChronoUnit.HOURS.between(birthDay, today));
        System.out.println("相差分数: " + ChronoUnit.MINUTES.between(birthDay, today));
        System.out.println("相差秒数: " + ChronoUnit.SECONDS.between(birthDay, today));


    }
}

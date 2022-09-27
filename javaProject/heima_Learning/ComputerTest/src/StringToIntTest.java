import java.util.Scanner;

public class StringToIntTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x_1 = sc.nextLine();
        String x_2 = sc.nextLine();

        System.out.println(Integer.parseInt(x_1) + Integer.parseInt(x_2));

    }
}

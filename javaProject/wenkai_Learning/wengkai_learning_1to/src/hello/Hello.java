import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
//		System.out.println("你好世界");
//		Scanner in = new Scanner(System.in); 
//		System.out.println("echo:" + in.nextLine());
		System.out.println("2 + 3 = " + 5);
		System.out.println("2 + 3 = " + 2 + 3);
		System.out.println("2 + 3 = " + (2 + 3));
		System.out.println(2 + 3 +" = 2 + 3 = " + (2 + 3));
		System.out.println("100 - 23 = " + (100 - 23));
		Scanner in = new Scanner(System.in); 
		System.out.println("100 - 23 = " + (100 - in.nextInt()));
//		System.out.println("100 - " + in.nextInt() + " = " + (100 - in.nextInt()));
		
/***************变量***********************/
		System.out.print("请输入被减数");
		int amount = in.nextInt();
		System.out.print("请输入减数");
		int price = in.nextInt();
		System.out.println(amount + " - " + price + " = " + (amount - price));
	}

}

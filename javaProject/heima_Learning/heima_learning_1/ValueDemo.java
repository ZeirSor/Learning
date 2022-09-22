public class ValueDemo {
	public static void main(String[] args) {
		// System.out.println(3);
		// System.out.println(3.14);
		// System.out.println(-2.71);

		// System.out.println("English2");
		// System.out.println('w');

		// System.out.println(false);
		// System.out.println(true);

		// //null can not be printed directly
		// //System.out.println(null);
		// System.out.println("null");
		
		System.out.println("123" + '\t' + "1234"); 
		System.out.println("12" + '\t' + "1234"); 
		
		int a = 1;
		System.out.println(a);
		a = 527;
		System.out.println(a);

		int g = 725;
		System.out.println(g); 

		System.out.println(17); 
		System.out.println(017);
		System.out.println(0b10001);
		System.out.println(0x17);   

		byte m = 125;
		System.out.println(m);  

		//if we want to define a long value, add 'L' as a suffix
		long n = 9999999999L;
		System.out.println(n);

		//if we want to define a float value, add 'F' as a suffix
		float f = 3.1415F;
		System.out.println(f);

		//boolean
		boolean b = true;
		System.out.println(b);

		String name = "你我他";
		System.out.println(name);
	}
}
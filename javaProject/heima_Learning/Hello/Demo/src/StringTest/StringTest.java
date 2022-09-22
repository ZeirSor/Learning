package StringTest;

public class StringTest {
    public static void main(String[] args) {
        String str = "abcd";
        char[] st = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%c ", str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            st[i] = str.charAt(i);
        }
        st[2] = 'v';
        str = new String(st);
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%c ", str.charAt(i));
        }

        System.out.println();
//        String str2 = "";
//        for (int i = 0; i < 1000000; i++) {
//            str2 += "abc";
//        }
//        System.out.println(str2);
        
    }
}

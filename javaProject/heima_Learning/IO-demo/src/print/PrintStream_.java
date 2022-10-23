package print;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.println("hello world!");
        out.write("你好，world".getBytes());

        String destOut = "C:\\Users\\ASUS\\Desktop\\print.txt";
        System.setOut(new PrintStream(destOut));
        System.out.println(destOut);

        out.close();
    }
}

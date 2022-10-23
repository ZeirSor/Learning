package print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        String destOut = "C:\\Users\\ASUS\\Desktop\\printWriter.txt";
        PrintWriter printWriter = new PrintWriter(new FileWriter(destOut));
        printWriter.println("hello world");
        printWriter.close();        //记得close 否则写不进文件
    }
}

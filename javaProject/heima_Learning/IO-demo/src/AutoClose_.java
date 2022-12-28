import java.io.FileReader;
import java.io.IOException;

public class AutoClose_ {
    public static void main(String[] args) {
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\FileOutputSreamDemo01.java";
        int readLen = 0;
        char[] buf = new char[8];

        try (FileReader fileReader = new FileReader(filePath)) {
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        FileReader fileReader = null;
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\FileOutputSreamDemo01.java";
        int data = 0;

        try {
            fileReader = new FileReader(filePath);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    @Test
    public void method01() {
        System.out.println("多个字符读取");
        FileReader fileReader = null;
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\FileOutputSreamDemo01.java";
        int readLen = 0;
        char[] buf = new char[8];

        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

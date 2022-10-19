import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    @Test
    public void method() {
        FileWriter fileWriter = null;
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\hello.txt";

        char[] chars = {'e', 'l', 'l', 'o'};

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('h');
            fileWriter.write(chars);
            fileWriter.write("hello world!".toCharArray(), 0, 5);
            fileWriter.write(" world!");
            fileWriter.write("hello world!", 0, 5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

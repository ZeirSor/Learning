import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSreamDemo01 {
    @Test
    public void method() {
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
//            true 追加内容
            fileOutputStream = new FileOutputStream(filePath, true);
            fileOutputStream.write('H');
            String str = "hello world!";
            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(), 0, 3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

import com.sun.source.tree.TryTree;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4 {
    @Test
    public void method01() {
        FileInputStream fileInputStream = null;
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\hello.txt";
        int readData = 0;

        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1) {
                System.out.println((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void method02() {
        FileInputStream fileInputStream = null;
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\hello.txt";
        int readLen = 0;
        byte[] buf = new byte[8];

        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
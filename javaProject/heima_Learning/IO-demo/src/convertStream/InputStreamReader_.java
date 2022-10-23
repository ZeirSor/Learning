package convertStream;

import org.junit.Test;

import java.io.*;

public class InputStreamReader_ {
    @Test
    public void GarbledDemo() throws IOException {
        String filePath = "C:\\Users\\ASUS\\Desktop\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        System.out.println(br.readLine());
        br.close();
    }

    @Test
    public void InputStreamReaderDemo() throws IOException {
        String filePath = "C:\\Users\\ASUS\\Desktop\\a.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        br.close();
    }


}

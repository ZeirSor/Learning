import java.awt.*;
import java.io.*;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\FileOutputSreamDemo01.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();

    }
}

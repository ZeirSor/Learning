import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\BufferedWriter_.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));

        bufferedWriter.write("hello BufferedWriter");
        bufferedWriter.newLine();

        bufferedWriter.write("hello BufferedWriter2");
        bufferedWriter.newLine();

        bufferedWriter.write("hello BufferedWriter3");
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

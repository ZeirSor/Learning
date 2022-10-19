import java.io.*;

public class BufferedCopyDemo {
    public static void main(String[] args) throws IOException {

        String srcFilePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\BufferedCopyDemo.java";
        String destFilePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\BufferedCopied.txt";

        BufferedReader br = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFilePath));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}

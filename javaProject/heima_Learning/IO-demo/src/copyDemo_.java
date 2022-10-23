import java.io.*;

public class copyDemo_ {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("srcFile.txt");
        File destFile = new File("destFile.txt");

        File diskPath = new File("/");
        System.out.println(diskPath.getAbsolutePath());

        File rootAbsPath = new File(".");
        System.out.println(rootAbsPath.getAbsolutePath());


    }
}

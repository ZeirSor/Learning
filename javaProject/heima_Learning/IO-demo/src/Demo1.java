import javax.security.auth.login.CredentialException;
import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        createFile01();
        createFile02();
        createFile03();
    }

    public static void createFile01() {
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\new1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("create!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFile02() {
        File parentFile = new File("E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\");
        String fileName = "new2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("create!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFile03() {
        String parentPath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\";
        String fileName = "new3.txt";

        try {
            new File(parentPath, fileName).createNewFile();
            System.out.println("create!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

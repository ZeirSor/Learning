import java.io.File;

public class RelativePathTest_ {
    public static void main(String[] args) {
        File file = new File("");
        System.out.println(file.getAbsolutePath());
//        E:\Learning\javaProject\heima_Learning
        File file1 = new File("test.txt");
        System.out.println(file1.getAbsolutePath());
//        E:\Learning\javaProject\heima_Learning\test.txt
        File file2 = new File("src/test.txt");
        System.out.println(file2.getAbsolutePath());
//        E:\Learning\javaProject\heima_Learning\src\test.txt
    }
}

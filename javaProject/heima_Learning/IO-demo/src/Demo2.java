import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        info();
    }

    public static void info() {
        File file = new File("E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\new1.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }

}

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
//        mkDir01();
//        mkDir02();
        mkDir03();
    }

    public static void mkDir01() {
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\new1.txt";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("delete");
            } else {
                System.out.println("delete failed");
            }
        } else {
            System.out.println("not exist!");
        }
    }

    public static void mkDir02() {
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\1234";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("delete");
            } else {
                System.out.println("delete failed");
            }
        } else {
            System.out.println("not exist!");
        }
    }

    public static void mkDir03() {
        String directoryPath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\123\\1234\\12\\1";
        File file = new File(directoryPath);

        if (file.exists()) {
            System.out.println("exists!");
        } else {
            if (file.mkdirs()) {
                System.out.println("create!");
            } else System.out.println("create failed!");
        }
    }
}

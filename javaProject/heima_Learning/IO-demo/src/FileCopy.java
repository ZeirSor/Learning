import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
//        创建文件输入流   将文件读入到程序
//        创建文件输出流   将读取到的文件数据 写入到指定文件
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String srcFilePath = "D:\\pictureGem\\gem01.jpg";
        String destFilePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\gem01-copy.jpg";

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            byte[] buf = new byte[1024];
            int readLen = 0;

            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);
            }

            System.out.println("copy successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

package ObjectDemo;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\ObjectDemo\\demo1.zs";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(3.14);
        oos.writeUTF("ZeirSor");

        oos.writeObject(new Dog("dog1", 5));

        oos.close();
    }
}

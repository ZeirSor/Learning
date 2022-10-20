package ObjectDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2 {
    public static void main(String[] args) {
        String destFilePath = "E:\\Learning\\javaProject\\heima_Learning\\IO-demo\\src\\ObjectDemo\\demo1.zs";
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(destFilePath));

            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readChar());
            System.out.println(ois.readDouble());
            System.out.println(ois.readUTF());

            Object o = ois.readObject();
            Dog dog2 = (Dog) o;
            System.out.println(dog2.toString());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

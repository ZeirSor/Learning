package test;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        final String ABS_PATH = System.getProperty("user.dir");
        System.out.println(ABS_PATH);
        File f = new File(ABS_PATH, "src\\test");
        System.out.println(f.getAbsolutePath());

        System.out.println(System.getProperty("java.class.path"));

        File f1 = new File("");
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        try {
            System.out.println(f1.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

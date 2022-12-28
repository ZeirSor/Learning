package RandomNaming_;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File name_assets = new File("src/name_assets.txt");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(name_assets));

        System.out.println(name_assets.getAbsolutePath());
    }
}

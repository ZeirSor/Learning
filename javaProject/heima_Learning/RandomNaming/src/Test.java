import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        File fileNameAssets = new File("src\\name_assets.txt");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameAssets));
        BufferedReader br = new BufferedReader(new FileReader(fileNameAssets));

        ArrayList<String> names = new ArrayList<>();

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            names.add(line);
        }

        System.out.println(fileNameAssets.getAbsolutePath());
//        System.out.println(names.size());
//        bw.close();
        br.close();


        int num = names.size();
//        System.out.println(names.get(0));
//        System.out.println((int) (Math.random() * num));
//        int ranIndex = (int) (Math.random() * num);
//        System.out.println(names.get(ranIndex));
        Student[] studentArr = new Student[num];
        for (int i = 0; i < num; i++) {
            studentArr[i] = new Student(names.get(i));
        }

        for (Student student : studentArr) {
            System.out.println(student);
        }

        Arrays.sort(studentArr);

        for (Student student : studentArr) {
            System.out.println(student);
        }

//        int[] isLogged = new int[num];

        JTextArea textArea = new JTextArea();
        LogThread lt = new LogThread(studentArr, textArea);
        Thread thread1 = new Thread(lt);
        Thread thread2 = new Thread(lt);
//        Thread thread3 = new Thread(lt);

        thread1.start();
        thread2.start();
//        thread3.start();
    }

}

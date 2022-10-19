package BufferDemo;

import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {
        new BufferedReader_(new FileReader_()).getReader_().readFile();
        new BufferedReader_(new FileReader_()).readFiles(5);

        new BufferedReader_(new StringReader_()).getReader_().readString();
        new BufferedReader_(new StringReader_()).readStrings(10);

        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
    }
}

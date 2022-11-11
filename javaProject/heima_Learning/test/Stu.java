package test;

public class Stu {

    public void test(Stu s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Stu().test(new Stu());
    }

    @Override
    public String toString() {
        return "test";
    }
}

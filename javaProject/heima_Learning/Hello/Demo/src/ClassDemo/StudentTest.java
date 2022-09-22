package ClassDemo;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("gloria");
        s.setGender("woman");
        s.setAge(18);

        System.out.println(s.getName());
        System.out.println(s.getGender());
        System.out.println(s.getAge());

        s.study();
        s.coding();
        s.singing();

        Student s1 = new Student("zs", "man", 1);

        System.out.println(s1.getName());
        System.out.println(s1.getGender());
        System.out.println(s1.getAge());
        s1 = null;
        System.out.println(s1.getAge());

    }
}

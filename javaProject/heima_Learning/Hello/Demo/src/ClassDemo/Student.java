package ClassDemo;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
        System.out.println("create!");
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("参数非法！");
        } else {
            this.age = age;
        }
    }

    public void setGender(String gender) {
        if (gender == "男" || gender == "女" || gender == "man" || gender == "woman") {
            this.gender = gender;
        } else {
            System.out.println("非法参数！");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void study() {
        System.out.println("do homework");
    }

    public void coding() {
        System.out.println("coding...");
    }

    public void singing() {
        System.out.println("singing");
    }
}

package TreeSetDemo;


public class Student implements Comparable<Student> {
    private String name;
    private int age;

    private int chinese;
    private int math;
    private int english;
    private int sum;

    public Student() {
    }

    public Student(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        setSum();
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
        setSum();
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
        setSum();
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
        setSum();
    }

    /**
     * 获取
     *
     * @return sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * 设置
     *
     * @param sum
     */
    public void setSum() {
        this.sum = this.chinese + this.math + this.english;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + ", sum = " + sum + "}";
    }

    @Override
    public int compareTo(Student o) {
        //比较总分
        int i = this.getSum() - o.getSum();
        //总分一样看语文
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        //语文一样看数学
        i = i == 0 ? this.getMath() - o.getMath() : i;
        //数学一样看英语
        //这里没有必要写, 因为前面都一样了英语必然也一样
//        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        //英语一样看年龄
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //年龄一样按照字母顺序排序
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}

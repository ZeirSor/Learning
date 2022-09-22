package WorkerExe;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("52725", "zhangsan", 12345.67, 52725);
        m.eat();
        m.work();
        System.out.println(m.toString());

        Cook c = new Cook();
        c.setId("4321");
        c.setName("lisi");
        c.setWage(12345.56);
        c.eat();
        c.work();
        System.out.println(c.toString());
    }
}

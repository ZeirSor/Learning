package ComprehensiveExe;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("laowang", 30);
        Dog d = new Dog(2, "黑");
        p1.keepPet(d, "骨头");
        d.watchHome();

        Person p2 = new Person("laoli", 25);
        Cat c = new Cat(3, "灰");
        p2.keepPet(c, "鱼");
        c.catchMouse();
    }
}

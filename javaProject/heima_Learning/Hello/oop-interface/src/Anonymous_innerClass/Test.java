package Anonymous_innerClass;

public class Test {
    public static void main(String[] args) {
        new Inter() {
            @Override
            public void swim() {
                System.out.println("重写了" + this.toString() + "的方法");
            }
        }.swim();

        Inter i = new Inter() {
            @Override
            public void swim() {
                System.out.println("重写了" + this.toString() + "的方法");
            }
        };
        i.swim();

        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了" + this.toString() + "的方法");
            }
        }.eat();

        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了" + this.toString() + "的方法");
            }
        };
        a.eat();
    }
}

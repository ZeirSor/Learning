package Demo2;

public class InterIplm implements Inter {
    @Override
    public void method1() {
        System.out.println("normal method in interface implements class");
    }

    @Override
    public void method2() {
        Inter.super.method2();
        System.out.println("default method Override in interface implements class");
    }
}

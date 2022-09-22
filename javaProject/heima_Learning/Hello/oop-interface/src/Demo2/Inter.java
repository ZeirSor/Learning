package Demo2;

public interface Inter {
    public abstract void method1();

    public default void method2() {
        System.out.println("default method in interface");
        show1();
        show2();
    }

    public static void method3() {
        System.out.println("static method in interface");
        show2();
    }

    private void show1() {
        System.out.println("default private method");
    }

    private static void show2() {
        System.out.println("static private method");
    }
}

package oi_OuterInerClass;

public class Test {
    public static void main(String[] args) {
        Waibu.Neubu wn = new Waibu().new Neubu();
        wn.method();

        Waibu.Inner wi = new Waibu.Inner();
        wi.method();
        Waibu.Inner.method1();

        Waibu w = new Waibu();
        w.method2();

    }
}

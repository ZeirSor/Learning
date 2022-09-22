package oi_OuterInerClass;

public class Waibu {
    private int a = 27;
    String n1 = "外部类成员";

    class Neubu {
        private int a = 77;

        public void method() {
            int a = 527;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Waibu.this.a);
        }
    }

    public static class Inner {
        private int b = 1;

        public static void method1() {
            System.out.println("static method");
            System.out.println("-------------------");
        }

        public void method() {
            System.out.println("normal method");
            System.out.println(b);
            System.out.println("-------------------");
        }
    }

    public void method2() {
        int a = 1;
        System.out.println("方法局部变量:" + a);

        System.out.println(n1);

        class Inner2 {
            String n = "局部内部类成员";

            public void method() {
                System.out.println("局部内部类的方法");
            }

            public static void method2() {
                System.out.println("局部内部类的静态方法");
            }
        }

        Inner2 i = new Inner2();
        System.out.println(i.n);
        i.method();
        Inner2.method2();
    }

    public void method_out() {
        System.out.println("outer method");
        System.out.println("-------------------");
    }
}

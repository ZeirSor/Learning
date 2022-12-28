package test;

import org.junit.Test;

class S {
    static void f() {
        System.out.println("S:f()");
    }
}

class T extends S {
    static void f() {
        System.out.println("T:f()");
    }
}

public class StaticTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        S s = new S();
        s.f();
        s = new T();
        s.f();
    }

    @Test
    public void method() {
        char c = 'c';
        int i = 10;
//        c = c + i;
        System.out.println(c);
    }
}



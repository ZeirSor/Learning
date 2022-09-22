package InterfacePolymorphism;

public class Person implements AllInter {
    @Override
    public void move() {
        System.out.println("using person to move home");
    }
}

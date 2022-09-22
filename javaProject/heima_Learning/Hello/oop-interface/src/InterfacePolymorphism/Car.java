package InterfacePolymorphism;

public class Car implements AllInter {
    @Override
    public void move() {
        System.out.println("using car to move home");
    }
}

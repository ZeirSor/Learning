package InterfacePolymorphism;

public class Truck implements AllInter {
    @Override
    public void move() {
        System.out.println("using truck to move home");
    }
}

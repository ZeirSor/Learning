package InterfacePolymorphism;

public class Test {
    public static void main(String[] args) {

        //多态数组
        AllInter[] inter = new AllInter[4];
        inter[0] = new Car();
        inter[1] = new MovingCompany();
        inter[2] = new Person();
        inter[3] = new Truck();

        for (AllInter allInter : inter) {
            move(allInter);
        };
    }

    public static void move(AllInter i) {
        i.move();
    }

}



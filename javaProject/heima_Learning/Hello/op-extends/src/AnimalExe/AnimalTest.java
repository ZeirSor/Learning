package AnimalExe;

public class AnimalTest {
    public static void main(String[] args) {
        BuouCat bc = new BuouCat();
        bc.catchMouse();
        bc.eat();
        bc.drink();
        System.out.println(bc.toString());

        ChinaLihuaCat lh = new ChinaLihuaCat();
        lh.catchMouse();
        lh.drink();
        lh.eat();
        System.out.println(lh.toString());

        HashiQi hs = new HashiQi();
        hs.destroyHome();
        hs.drink();
        hs.eat();
        hs.watchHome();
        System.out.println(hs.toString());

        Taidi td = new Taidi();
        td.drink();
        td.eat();
        td.rubing();
        td.watchHome();
        System.out.println(td.toString());
    }
}

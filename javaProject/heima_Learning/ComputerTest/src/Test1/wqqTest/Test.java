package Test1.wqqTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shape[] te = new Shape[4];
        te[0] = new Triangle(1, 1, 1);
        te[1] = new Triangle(2, 2, 2);
        te[2] = new Circle(2);
        te[3] = new Circle(1);
        ArrayList<Shape> list = new ArrayList();
        for (int i = 0; i < 4; i++) {
            list.add(te[i]);
        }
        Iterator<Shape> it = list.iterator();
        while (it.hasNext()) {
            Draw t = (Draw) it.next();
            t.DrawItem();
        }

        System.out.println("------------------------------");
        Arrays.sort(te);

        it = list.iterator();
        while (it.hasNext()) {
            Draw t = (Draw) it.next();
            t.DrawItem();
        }

        System.out.println("------------------------------");

        for (Shape draw : te) {
            System.out.println(draw);
        }

        list.sort(new Comparator<>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.length, o2.length);
            }
        });

        System.out.println("--------------list sort----------------");

        for (Shape shape : list) {
            System.out.println(shape);
        }

    }

}

package GenericsExercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
//        Cat[] c = new Cat[5];
//        c[0] = new Bosi("bosi1", 4);
//        c[1] = new Bosi("bosi2", 5);
//        c[2] = new Bosi("bosi3", 6);
//        c[3] = new Bosi("bosi4", 7);
//        c[4] = new Bosi("bosi5", 8);
//        ArrayList<Animal> list = new ArrayList<>();
//        list.add(new Bosi("bosi1", 11));
//
//        KeepPet(list);
    }

    public static void keepPet(ArrayList<? extends Dog> list) {
        for (Dog dog : list) {
            dog.eat();
        }
    }

    public static void KeepPet(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            cat.eat();
        }
    }

//    public static void keepPet(ArrayList<Animal> list) {
//        for (Animal animal : list) {
//            animal.eat();
//        }
//    }

}


package Generics;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        MyArrayList<String> myList1 = new MyArrayList<>();

        myList1.add("111");
        myList1.add("333");
        myList1.add("222");

        System.out.println(myList1.get(2));
        System.out.println(myList1.toString());

        MyArrayList<Integer> myList2 = new MyArrayList<>();

        myList2.add(5);
        myList2.add(2);
        myList2.add(7);

        System.out.println(myList2.get(1));
        System.out.println(myList2.toString());

        ListUtil.addAll(myList1, "431", "231");
        System.out.println(myList1.get(4));
        System.out.println(myList1.toString());

    }
}



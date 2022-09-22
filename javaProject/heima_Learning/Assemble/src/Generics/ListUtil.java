package Generics;

public class ListUtil {
    public ListUtil() {
    }

    public static <E> void addAll(MyArrayList<E> list, E... e) {
        for (E element : e) {
            list.add(element);
        }
    }

    
}

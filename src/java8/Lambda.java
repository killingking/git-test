package java8;

import java.util.Comparator;

public class Lambda {
    public static void main(String[] args) {
//        Comparator comparator = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return
//            }
//        };

        Comparator<Integer> comparator = (o1,o2)->o1-o2;
        int compare = comparator.compare(26, 24);
        System.out.println(compare);
    }
}

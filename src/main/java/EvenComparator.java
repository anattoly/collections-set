package main.java;

import java.util.Comparator;

public class EvenComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 != 0 & o2 % 2 != 0 | o1 % 2 == 0 & o2 % 2 == 0) {
            return o1.compareTo(o2);
        } else if (o1 % 2 == 0 & o2 % 2 != 0) {
            return -1;
        } else {
            return 1;
        }
    }
}

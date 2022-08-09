package org.ulquiango.ejemplo.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {

        /*
         * It has order by numeric or alphabetical, but it has high pc power consumption
         */
        Set<String> ts = new TreeSet<>();
        ts.add("three");
        ts.add("four");
        ts.add("five");
        ts.add("one");
        ts.add("two");

        System.out.println(ts);

        /*Order */
        Set<Integer> number = new TreeSet<>();
        number.add(8);
        number.add(7);
        number.add(12);
        number.add(1);
        number.add(5);

        System.out.println(number);
        /*Order DES*/
        Set<String> ts1 = new TreeSet<>(Comparator.reverseOrder());
        ts1.add("three");
        ts1.add("four");
        ts1.add("five");
        ts1.add("one");
        ts1.add("two");

        System.out.println(ts1);
    }
}

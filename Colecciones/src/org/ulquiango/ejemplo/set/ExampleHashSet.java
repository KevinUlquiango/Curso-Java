package org.ulquiango.ejemplo.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        /*
        * The "set" method doesn't allow duplicates
        */
        Set<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");

       boolean isValid= hashSet.add("one");
        System.out.println("Does the 'set' method allow duplicates? " + isValid);

        System.out.println(hashSet);

    }
}

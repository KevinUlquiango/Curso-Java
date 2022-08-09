package org.ulquiango.ejemplo.set;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {

        String fishes []= {"corvina","lenguado","Atun","lenguado","Atun","Sardina","Chavela"};

        Set<String> uniques = new HashSet<>();
        Set<String> fishDuplicates = new HashSet<>();

        for (String fish:fishes){
            if (!uniques.add(fish)){
                System.out.println("The repeated fish is : " + fish);
                fishDuplicates.add(fish);
            }
        }

        //Duplicates removed
        uniques.removeAll(fishDuplicates);

        System.out.println("Non-repeating fish are: " + uniques.size() + " " + uniques);

        System.out.println("Duplicate fish are: " + fishDuplicates);

    }
}

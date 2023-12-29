package JavaPractice.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String args[]) {
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(100);
        hs.add("Hello");
        hs.add(16.0);
        hs.add('A');
        hs.add('X');
        hs.add(85);
        hs.add(null);
        hs.add(true);
        System.out.println("Linked Hash Set: " + hs);

        hs.remove('A');
        System.out.println("After Removing: " + hs);

        System.out.println(hs.contains(true));
        System.out.println(hs.contains(12));
        System.out.println(hs.isEmpty());

        System.out.println("Printing element from for each loop");
        for(Object a: hs) {
            System.out.println(a);
        }

        System.out.println("Printing element from iterator");
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); // prints the current element and move to next element
        }

        LinkedHashSet<Integer> evenNum = new LinkedHashSet<Integer>(10, 1);
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);
        evenNum.add(8);
        evenNum.add(10);

        hs.addAll(evenNum);
        System.out.println("After add all: " + hs);
        System.out.println("Contains all: " + hs.containsAll(evenNum));

        hs.retainAll(evenNum);
        System.out.println("Retain the evenNum: " + hs);

        hs.add(4);
        System.out.println("After adding duplicate value: " + hs);

        hs.removeAll(evenNum);
        System.out.println("After Removing: "+ hs);
    }
}

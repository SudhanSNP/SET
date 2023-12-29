package JavaPractice.Collections;

import java.util.*;

public class LinkedListPractice {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.add(100);
        list.add("Hello");
        list.add(16.0);
        list.add('A');
        list.add('X');
        list.add(85);
        list.add(null);
        list.add(true);
        list.addFirst('A');
        list.addLast(58);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(1);
        list.remove(16.0);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing: "+ list);

        list.set(1, "Java");
        System.out.println("After updating: "+ list);

        System.out.println("Retrieving element: "+ list.get(2));
        System.out.println("Retrieving first element: "+ list.getFirst());
        System.out.println("Retrieving last element: "+ list.getLast());

        System.out.println(list.contains(null));
        System.out.println(list.contains(true));

        System.out.println(list.isEmpty());

        System.out.println("Printing element from for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Printing element from for each loop");
        for(Object a: list) {
            System.out.println(a);
        }

        System.out.println("Printing element from iterator");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); // prints the current element and move to next element
        }

        LinkedList<String> monthList = new LinkedList<String>();
        monthList.add("January");
        monthList.add("March");
        monthList.add("May");
        monthList.add("April");
        monthList.add("July");

        list.addAll(monthList);
        System.out.println("Adding all element to arr: " + list);

        list.removeAll(monthList);
        System.out.println("Adding all element to arr: " + list);

        Collections.sort(monthList);
        System.out.println("Sorting: " + monthList);

        Collections.sort(monthList, Collections.reverseOrder());
        System.out.println("Reverse sorting: " + monthList);

        Collections.shuffle(monthList);
        System.out.println("Shuffled num: " + monthList);

        boolean a[] = {true, false, false};
        LinkedList flag = new LinkedList(Arrays.asList(a));
        System.out.println("Converted array: " + flag);
    }
}

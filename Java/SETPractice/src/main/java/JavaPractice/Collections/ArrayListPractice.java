package JavaPractice.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {

        // Declare a ArrayList of type Object
        ArrayList arr = new ArrayList();

        arr.add(100);
        arr.add("Hello");
        arr.add(45.67);
        arr.add(true);
        System.out.println(arr);
        System.out.println("Size: " + arr.size());

        arr.remove(1);
        System.out.println("After Removing: " + arr);

        arr.add(1, "Welcome");
        System.out.println("After Adding: " + arr);

        Object value = arr.get(1);
        System.out.println("New Element: " + value);

        arr.set(1, "JAVA");
        System.out.println("After Updating: " + arr);

        System.out.println(arr.contains(100));
        System.out.println(arr.contains("Hello"));
        System.out.println(arr.isEmpty());

        System.out.println("Printing element from for loop");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println("Printing element from for each loop");
        for(Object a: arr) {
            System.out.println(a);
        }

        System.out.println("Printing element from iterator");
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); // prints the current element and move to next element
        }

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(43);
        num.add(23);
        num.add(90);

        arr.addAll(num);
        System.out.println("Adding all element to arr: " + arr);

        arr.removeAll(num);
        System.out.println("Adding all element to arr: " + arr);

        Collections.sort(num);
        System.out.println("Sorting: " + num);

        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Reverse sorting: " + num);

        Collections.shuffle(num);
        System.out.println("Shuffled num: " + num);

        String a[] = {"Dog", "Cat", "Bear"};
        ArrayList animal = new ArrayList(Arrays.asList(a));
        System.out.println("Converted array: " + animal);
    }
}

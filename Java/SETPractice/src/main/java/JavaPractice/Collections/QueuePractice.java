package JavaPractice.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueuePractice {
    public static void main(String args[]) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(100);
        queue.add(25);
        queue.add(16);
        queue.add(35);
        queue.add(96);
        queue.offer(100);
        System.out.println("Queue: " + queue);

        System.out.println("Head element: " + queue.element()); // throws exception if queue is empty
        System.out.println("Head element: " + queue.peek());

        System.out.println("Return and removing element: "+ queue.remove()); // throws exception if queue is empty
        System.out.println(queue);
        System.out.println("Return and removing element: "+ queue.poll());
        System.out.println(queue);

        System.out.println("Printing element from for each loop");
        for(Integer a: queue) {
            System.out.println(a);
        }

        System.out.println("Printing element from iterator");
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); // prints the current element and move to next element
        }

        System.out.println("*******  Linked List Example *******");

        LinkedList list = new LinkedList();

        list.add(100);
        list.add(25);
        list.add(16);
        list.add(35);
        list.add(96);
        list.offer("Hello");
        System.out.println("Queue: " + list);

        System.out.println("Head element: " + list.element()); // throws exception if queue is empty
        System.out.println("Head element: " + list.peek());

        System.out.println("Return and removing element: "+ list.remove()); // throws exception if queue is empty
        System.out.println(list);
        System.out.println("Return and removing element: "+ list.poll());
        System.out.println(list);

        System.out.println("Printing element from for each loop");
        for(Object a: list) {
            System.out.println(a);
        }

        System.out.println("Printing element from iterator");
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); // prints the current element and move to next element
        }
    }
}

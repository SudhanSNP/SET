package JavaPractice.Collections;

import java.util.*;

public class HashTablePractice {
    public static void main(String args[]) {
        Hashtable table = new Hashtable();

        table.put(1, "Sudhan");
        table.put(5, true);
        table.put(2, 100);
        table.put(3, 'A');
        table.put("Name", "Sudhan");
        System.out.println(table);

        HashMap<Integer, Character> charTable = new HashMap<Integer, Character>(10, 0.9f);
        charTable.put(10, 'A');
        charTable.put(11, 'B');
        charTable.put(13, 'C');
        charTable.put(14, 'D');
        charTable.put(15, 'X');
        table.putAll(charTable);
        System.out.println(table);

        System.out.println("Get data: "+ table.get(10));

        table.remove(10);
        System.out.println("After removing: "+ table);

        System.out.println("Contains Key: "+ table.containsKey("Name"));
        System.out.println("Contains Value: "+ table.containsValue(100));
        System.out.println("Empty check: "+ table.isEmpty());

        System.out.println("Key set: "+ table.keySet());
        System.out.println("Values collection: "+ table.values());
        System.out.println("Entry Set: "+ table.entrySet());

        for(Object k: table.keySet()) {
            System.out.println("Keys: "+ k);
        }

        for(Object k: table.values()) {
            System.out.println("Values: "+ k);
        }

        for(Map.Entry<Integer, Character> k: charTable.entrySet()) {
            System.out.println("Key: "+ k.getKey() + " Value: "+ k.getValue());
        }

        for (Object m: table.entrySet()) {
            System.out.println(m);
        }

        Set mapSet = table.entrySet();
        Iterator it = mapSet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

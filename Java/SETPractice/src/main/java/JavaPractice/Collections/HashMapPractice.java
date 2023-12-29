package JavaPractice.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {
    public static void main(String args[]) {
        HashMap map = new HashMap();

        map.put(1, "Sudhan");
        map.put(null, true);
        map.put(2, 100);
        map.put(3, 'A');
        map.put(4, "Sudhan");
        System.out.println(map);

        HashMap<Integer, Character> charMap = new HashMap<Integer, Character>();
        charMap.put(10, 'A');
        charMap.put(11, 'B');
        charMap.put(13, 'C');
        charMap.put(14, 'D');
        charMap.put(15, 'X');
        map.putAll(charMap);
        System.out.println(map);

        System.out.println("Get data: "+ map.get(null));

        map.remove(null);
        System.out.println("After removing: "+ map);

        System.out.println("Contains Key: "+ map.containsKey(null));
        System.out.println("Contains Value: "+ map.containsValue(100));
        System.out.println("Empty check: "+ map.isEmpty());

        System.out.println("Key set: "+ map.keySet());
        System.out.println("Values collection: "+ map.values());
        System.out.println("Entry Set: "+ map.entrySet());

        for(Object k: map.keySet()) {
            System.out.println("Keys: "+ k);
        }

        for(Object k: map.values()) {
            System.out.println("Values: "+ k);
        }

        for(Map.Entry<Integer, Character> k: charMap.entrySet()) {
            System.out.println("Key: "+ k.getKey() + " Value: "+ k.getValue());
        }

        for (Object m: map.entrySet()) {
            System.out.println(m);
        }

        Set mapSet = map.entrySet();
        Iterator it = mapSet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

package CollectionsFrameWork;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();

        map.put(3,"c");
        map.put(1,"A");
        map.put(2,"B");
        map.put(4,"D");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        map.remove(2);
        System.out.println(map);
    }
}
/**
 * Stores teh elements in key and value pair
 * key must be unique
 * Automatically stores the keys
 * uses hash internally
 * uses tree Structure
 * Slower than Hashmapde
 * 
 */
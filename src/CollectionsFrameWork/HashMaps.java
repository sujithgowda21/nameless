package CollectionsFrameWork;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        //put()
        map.put(1,"apple");
        map.put(2,"srujan");
        map.put(3,"idiot");
        System.out.println(map);

        //get()
        System.out.println(map.get(2));

        //containskey
        System.out.println((map.containsKey(3)));

        //remove()
        map.remove(1);
        System.out.println(map);
    }
}
/**
 * stores the elements in key and value pair
 * key must be unique
 * maintains the order of insertion
 * uses hash internally
 * uses node structure
 */

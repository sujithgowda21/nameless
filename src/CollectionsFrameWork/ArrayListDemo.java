package CollectionsFrameWork;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println(" Array List is : "+list);

        // get
        System.out.println("Element add Index 1 is : "+ list.get(1));

        // size
        System.out.println("Size of The Arfray List is :"+list.size());

        //contains
        System.out.println("contain 30? : "+ list.contains(30));

        // Remove
        list.remove(3);
        System.out.println("After removing The list is : "+list);
    }
}
/**
 * Maintains the insertion order
 * allows duplicates
 * Dynamic in size
 * index based access
 * readind elements is faster
 */
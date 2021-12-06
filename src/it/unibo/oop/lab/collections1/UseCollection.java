package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
    	final int MIN = 1000;
    	final int MAX = 2000;
    	final int HEAD = 0;
    	int temp ;
    	List<Integer> aList = new ArrayList<>();
    	List<Integer> lList = new LinkedList<>(aList);
    	temp = aList.get(HEAD);
    	aList.set(HEAD, aList.get(aList.size() - 1));
    	aList.set(aList.size()-1, temp);
    	for (int i = MIN ; i < MAX - 1; i++) {
    		aList.add(i);
    	}
    	for(Integer elem: aList) {
    		System.out.println(elem);
    	}
    	
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
    
    private static void fillWith (List<Integer> list , int numElem) {
    	final int HEAD = 0;
    	final int TO_MS = 1_000_000;
        long time = System.nanoTime();
       
        for (int i = 1; i <= numElem; i++) {
           list.add(HEAD, i);
        }
        time = System.nanoTime() - time;
        System.out.println("Converting " + numElem
                + " int to String and inserting them in a Set took " + time
                + "ns (" + time / TO_MS + "ms)");
        System.out.println(list);
    }
}

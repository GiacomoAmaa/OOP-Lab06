package it.unibo.oop.lab.collections1;

import java.util.*;

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
    	final int MIN = 1000;
    	final int MAX = 2000;
    	final int HEAD = 0;
    	final int TEST_SIZE = 100000;
    	final int TO_READ = 1000;
    	final String[] continents = {"Africa", "Americas", "Antartica", "Asia", "Europe", "Oceania"};
    	final double [] population = {1110635000, 972005000, 0, 4298723000.0, 742452000, 38304000 };
    	
    	double totPopulation = 0;
    	int temp ;
    	
    	List<Integer> aList = new ArrayList<>();
    	temp = aList.get(HEAD);
    	aList.set(HEAD, aList.get(aList.size() - 1));
    	aList.set(aList.size()-1, temp);
    	for (int i = MIN ; i < MAX - 1; i++) {
    		aList.add(i);
    	}
    	for(Integer elem: aList) {
    		System.out.println(elem);
    	}
    	
    	List<Integer> lList = new LinkedList<>(aList);
    	fillWith(aList,TEST_SIZE);
    	fillWith(lList,TEST_SIZE);
    	testRead(aList,TO_READ);
    	testRead(lList,TO_READ);
    	
    	Map<String,Double> map = new TreeMap<>();
    	for(int i = 0 ;i < continents.length; i++) {
    		map.put(continents[i], population[i]);
    	}
    	 for (Double elem : map.values()) {
    		 totPopulation += elem;
    	 }
    	 System.out.println(totPopulation);
    
    }
    
    private static void fillWith (List<Integer> list , int numElem) {
    	final int HEAD = 0;
    	final int TO_MS = 1_000_000;
        long time = System.nanoTime();
       
        for (int i = 1; i <= numElem; i++) {
           list.add(HEAD, i);
        }
        time = System.nanoTime() - time;
        System.out.println("Inserting " + numElem
                + " int in a list took " + time
                + "ns (" + time / TO_MS + "ms)");
        System.out.println(list);
    }
    
    private static void testRead (List<Integer> list , int toRead) {
    	final int TO_MS = 1_000_000;
        long time = System.nanoTime();
        final int MIDDLE = list.size()/2 ;
       
        for (int i = 1; i <= toRead; i++) {
           list.get(MIDDLE);
        }
        time = System.nanoTime() - time;
        System.out.println("Reading " + toRead
                + " elements in the middle of a list took " + time
                + "ns (" + time / TO_MS + "ms)");
    }
    
}

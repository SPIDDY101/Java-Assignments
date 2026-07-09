package demo.Assigments;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.HashSet;

	public class Assigment4 {

	    public static void main(String[] args) {

	        // ArrayList
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Mango");

	        System.out.println("ArrayList: " + arrayList);

	        // LinkedList
	        LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("Red");
	        linkedList.add("Blue");
	        linkedList.add("Green");

	        System.out.println("LinkedList: " + linkedList);

	        // HashSet
	        HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("Java");
	        hashSet.add("Python");
	        hashSet.add("C++");

	        System.out.println("HashSet: " + hashSet);

	        // Differences
	        System.out.println("\nDifferences:");
	        System.out.println("1. ArrayList stores elements in order and allows duplicate values.");
	        System.out.println("2. LinkedList also stores elements in order and allows duplicates. It is better for frequent insertions and deletions.");
	        System.out.println("3. HashSet does not allow duplicate elements and does not maintain insertion order.");
	    }
	}

import java.util.ArrayList;
import java.util.LinkedList;

public class ListComparison{
	public static void main (String [] args){
		//YOUR CODE HERE
		ArrayList<Integer> arraylist_entries = new ArrayList<Integer>();
		LinkedList<Integer> linkedlist_entries = new LinkedList<Integer>();
		
		double TimeTaken_add=0;
		double startTime_add = System.nanoTime();
		for(int i=0; i<1000000;i++){
			arraylist_entries.add(i);
		}
		//long TimeTaken =0;
		double endTime_add = System.nanoTime();
		TimeTaken_add = endTime_add - startTime_add;
		System.out.println("Arraylist add : "+(TimeTaken_add/1000000000));
		
		double TimeTaken_get =0;
		double startTime_get = System.nanoTime();
		for(int i=0; i<1000000;i++){
			arraylist_entries.get(i);
		}
		double endTime_get = System.nanoTime();
		TimeTaken_get = endTime_get - startTime_get;
		System.out.println("Arraylist get: "+(TimeTaken_get/1000000000));
		
		double TimeTaken_remove =0;
		double startTime_remove = System.nanoTime();
		for(int i=0; i>1000000;i++){
			arraylist_entries.remove(i);
		}
		double endTime_remove = System.nanoTime();
		TimeTaken_remove = endTime_remove - startTime_remove;
		System.out.println("Arraylist remove: "+(TimeTaken_remove/1000000000));
		
		//linkedlist
		TimeTaken_add=0;
		startTime_add = System.nanoTime();
		for(int i=0; i<1000000;i++){
			linkedlist_entries.add(i);
		}
		endTime_add = System.nanoTime();
		TimeTaken_add = endTime_add - startTime_add;
		System.out.println("Linkedlist add : "+(TimeTaken_add/1000000000));
		
		TimeTaken_get =0;
		startTime_get = System.nanoTime();
		for(int i=0; i<1000000;i++){
			linkedlist_entries.get(i);
		}
		endTime_get = System.nanoTime();
		TimeTaken_get = endTime_get - startTime_get;
		System.out.println("Linkedlist get: "+(TimeTaken_get/1000000000));
		
		TimeTaken_remove =0;
		startTime_remove = System.nanoTime();
		for(int i=0; i>1000000;i++){
			linkedlist_entries.remove(i);
		}
		endTime_remove = System.nanoTime();
		TimeTaken_remove = endTime_remove - startTime_remove;
		System.out.println("Linkedlist remove: "+(TimeTaken_remove/1000000000));
		
		
	}
}
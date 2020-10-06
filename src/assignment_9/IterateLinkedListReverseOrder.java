package assignment_9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class IterateLinkedListReverseOrder {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		 String name="";
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the count of users to be added to the list");
			int count=scan.nextInt();
			for(int i=0;i<count;i++) {
				System.out.println("Add the name of "+(i+1)+" user");
				name=scan.next();
				list.add(name);
			}
		System.out.println("The actual List of the names are :  \n"+list);
		Iterator it = list.descendingIterator();
		System.out.println("List in Reverse Order :");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
	}

}

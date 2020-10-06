package assignment_9;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListAtFirstAndLast {

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
			System.out.println("The List of the elements before adding at first and last location : \n"+list);
			System.out.println("Enter the First element to be added");
			name = scan.next();
			list.addFirst(name);
			System.out.println("Enter the last element to be added");
			name = scan.next();
			list.addLast(name);
			System.out.println("The List of the elements after adding at first and last location : \n"+list);
	}

}

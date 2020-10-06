package assignment_9;

import java.util.LinkedList;
import java.util.Scanner;

public class ElementAtEndOfLinkedList {

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
			
			System.out.println("The List of names before adding at the end of Linked List \n"+list);
			System.out.println("Enter the name to be added at the end of linked list");
			name =scan.next();
			list.addLast(name);
			System.out.println("The List of names after adding at the end of Linked List \n"+list);

	}

}

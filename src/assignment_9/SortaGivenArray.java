package assignment_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortaGivenArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int element=0;
		System.out.println("Enter the count of users to be added to the list");
		Scanner scan = new Scanner(System.in);
		int count=scan.nextInt();		
		for(int i=0;i<count;i++) {
			System.out.println("Enter the "+(i+1)+" element");
			element=scan.nextInt();
			list.add(element);
		}
		System.out.println("The list before sorting is "+list);
		System.out.println("Enter 1 to sort in ascending and 2 to sort in Descending");
		element =scan.nextInt();
		if(element==1) {
			Collections.sort(list);
			System.out.println("The List after sorting in ascending order is "+list);
		}
		else if(element==2) {
			Collections.sort(list, Collections.reverseOrder());
			System.out.println("The List after sorting in descending order is "+list);
		}
			
		else
			System.out.println("The entry is invalid");
	}

}

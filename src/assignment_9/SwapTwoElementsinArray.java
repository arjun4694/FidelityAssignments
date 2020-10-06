package assignment_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapTwoElementsinArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String name="";
		int firstIndex=0;
		int secondIndex=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of users to be added to the list");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Add the name of "+(i+1)+" user");
			name=scan.next();
			list.add(name);
		}
		System.out.println("The elements in the list before swap are : \n"+list);
		do {
		System.out.println("Enter the first index to be swapped");
		 firstIndex = scan.nextInt();
		 if(firstIndex<0)
			 System.out.println("The first index entered is invalid, Enter a valid Index");
		}while(firstIndex<0);
		
		do {
			System.out.println("Enter the second index to be swapped");
			secondIndex = scan.nextInt();
			 if(secondIndex>(count-1))
				 System.out.println("The second index entered is invalid, Enter a valid Index");
			}while(secondIndex>(count-1));
		
		Collections.swap(list, firstIndex, secondIndex);
		System.out.println("The elements in the list after swap are : \n"+list);
	}

}

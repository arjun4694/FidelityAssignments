package assignment_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		String name="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of users to be added to the list");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Add the name of "+(i+1)+" user");
			name=scan.next();
			list1.add(name);
		}
		System.out.println("The value of list1 is : \n"+list1);
		System.out.println("The value in list2 before copying is : \n"+list2);
		list2.addAll(list1);
		System.out.println("The value in list2 after copying is : \n"+list2);
	}

}

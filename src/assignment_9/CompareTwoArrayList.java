package assignment_9;

import java.util.ArrayList;
import java.util.Scanner;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> firstList=new ArrayList<String>(); 
		ArrayList<String> secondList=new ArrayList<String>();
		String name="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of users to be added to the list");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Add the name of "+(i+1)+" user in firstList");
			name=scan.next();
			firstList.add(name);
		}
		for(int i=0;i<count;i++) {
			System.out.println("Add the name of "+(i+1)+" user in secondList");
			name=scan.next();
			secondList.add(name);
		}
		
		if(firstList.equals(secondList))
			System.out.println(firstList + "  matches with  " +secondList);
		else
			System.out.println(firstList + "  does not match with  " +secondList);
	}

}

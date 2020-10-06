package assignment_9;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		String name="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of users to be added to the list");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Add the name of "+(i+1)+" user");
			name=scan.next();
			hset.add(name);
		}
		System.out.println("The Elements in the Hashset are : \n"+hset);
		Object[] arr = hset.toArray();
		System.out.println("The Elements of the array are :");
		for(Object elements:arr) {
			System.out.println(elements);
		}
	}

}

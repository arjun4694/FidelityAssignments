package assignment_9;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElementFromArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String name="";
		int index=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of users to be added to the list");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Add the name of "+(i+1)+" user");
			name=scan.next();
			list.add(name);
		}

		System.out.println("The names in the list are \n"+list);
		do {
		System.out.println("Enter the index of the name to be retrieved");
		 index = scan.nextInt();
		if(index>(count-1))
			System.out.println("No value exists in the Index entered, Enter a Valid Index");		
		}while(index>(count-1));
		System.out.println("The name in the specified index is : "+list.get(index));
	}

}

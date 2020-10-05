package assignment_9;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingElementAtFirstposition {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String name="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Add 2 users to the list");
		for(int i=0;i<2;i++) {
			System.out.println("Add the name of "+(i+1)+" user");
			name=scan.next();
			list.add(name);
		}
		System.out.println("The list of names before adding the name at the first position \n"+list);
		System.out.println("Mention the name of the user to be added at the first location");
		name=scan.next();
		list.add(0, name);
		System.out.println("The list of names after adding the name at the first position \n"+list);
	}

}

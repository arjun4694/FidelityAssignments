package assignment_9;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		int index=0;
		String name="";
		int counter=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of users to be added to the list");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Add the name of "+(i+1)+" user");
			name=scan.next();
			list.add(name);
		}

		System.out.println("Enter the element to be searched in the Array");
		String element = scan.next();
		for(int i=0;i<count;i++) {
			if(list.get(i).equalsIgnoreCase(element)) {
				index = i;
				counter++;
				break;
			}
			else
				continue;
		}
if(counter>0)
	System.out.println("The element "+element+" is found at index "+index);
else
	System.out.println("The element is not present in the list");
	}

}

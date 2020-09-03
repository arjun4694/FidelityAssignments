package assignment_6;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		
			int[] intArray = {25,75,89,86,44};
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the index whose data is to be printed");
			try {
			int index=scan.nextInt();
			System.out.println("The value under the index is : "+intArray[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you have entered is invalid");
		}

	}

}

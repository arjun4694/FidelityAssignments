package additionalExercise;

import java.util.Scanner;

abstract class Adder extends Arithmetic {	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("Enter the first digit");
		int a = s.nextInt();
		System.out.println("Enter the second digit");
		int b= s.nextInt();
		int c= add(a, b);		
		System.out.println("The sum of the digits is : "+c);
		}
		finally {
		s.close();
		}

	}

}

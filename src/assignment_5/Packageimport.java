package assignment_5;

import java.util.Scanner;

import assignment_4.Abstractmethodforassignment5;

class methods extends Abstractmethodforassignment5{

	@Override
	protected void multiply(float a, float b) {
		float c= a*b;
		System.out.println();
		System.out.println("The result of multiplication is : "+c);
	}

	@Override
	protected void subtract(float a, float b) {
		float c= a-b;
		System.out.println();
		System.out.println("The result of subtraction is : "+c);
	}

	@Override
	protected void divide(float a, float b) {
		if(b==0) {
			System.out.println();
			System.out.println("The value of the denominator cannot be "+b);
		}
		else {
			float c= (a/b);
			System.out.println();
			System.out.println("The result of division is : "+c);
		}
	}

	@Override
	protected void factorial(int a) {
		int temp=1;
		for(int i=a;i>0;i--) {
			 temp=temp*i;
		}
		System.out.println();
		System.out.println("The factorial of "+a+" is : "+temp);
	}

	@Override
	protected void reversing(int a) {
		int reversednum = 0;
		int temp =a;
        while(a != 0) {
            int digit = a % 10;
            reversednum = reversednum * 10 + digit;
            a /= 10;
        }
        
        System.out.println("Reverse of " +temp +" is:  "+reversednum);
	}
	
}

public class Packageimport{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first digit");
		float a = scan.nextFloat();
		System.out.println("Enter Second digit");
		float b = scan.nextFloat();
		methods m = new methods();
		m.subtract(a, b);
		m.multiply(a, b);
		m.divide(a, b);
		System.out.println("Enter a digit whose factorial is to be found");
		int fact = scan.nextInt();
		m.factorial(fact);
		System.out.println("Enter a digit to reverse it");
		int c= scan.nextInt();
		m.reversing(c);

	}

}

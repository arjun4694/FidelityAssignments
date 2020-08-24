package assignment_2;

import java.util.Scanner;

public class Even_odd_reversing_digit {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=0;
		double j=0;
		long k=0;
		System.out.println("Enter the program number to be executed");
		int value=s.nextInt();
		switch(value) {
		case 1:
			System.out.println("Enter the number whose table is to be tabulated");
			 n=s.nextInt();
			tableOfDesiredNumber(n);
			break;
			
		case 2:
			System.out.println();
			System.out.println("Enter the Last value of the integer till which the number is to be printed");
			n=s.nextInt();
			printIntegerTillDesiredNumber(n);
			break;
			
		case 3:
			System.out.println();
			System.out.println("Enter the number whose cude is to be determined");
			j=s.nextDouble();
			cubeOfGivenNumber(j);
			break;
			
		case 4:
			System.out.println();
			System.out.println("Enter the digit which has to be reversed");
			k=s.nextLong();
			reverseDigitOfGivenNumber(k);
			break;
			
		case 5:
			System.out.println();
			System.out.println("Enter the digit which has to be determined as Odd or Even");
			n=s.nextInt();
			toDetermineOddOrEven(n);
			break;
			
		default:
			System.out.println("Enter the number whose table is to be tabulated");
			 n=s.nextInt();
			tableOfDesiredNumber(n);
			
			System.out.println();
			System.out.println("Enter the Last value of the integer till which the number is to be printed");
			n=s.nextInt();
			printIntegerTillDesiredNumber(n);
			
			System.out.println();
			System.out.println("Enter the number whose cude is to be determined");
			j=s.nextDouble();
			cubeOfGivenNumber(j);
			
			System.out.println();
			System.out.println("Enter the digit which has to be reversed");
			k=s.nextLong();
			reverseDigitOfGivenNumber(k);
			
			System.out.println();
			System.out.println("Enter the digit which has to be determined as Odd or Even");
			n=s.nextInt();
			toDetermineOddOrEven(n);
			break;
	}
}
		
		public static void tableOfDesiredNumber(int n) {
			int temp=0;
			for(int i=1;i<=10;i++) {
				temp=n*i;
				System.out.println(n+"x"+i+"="+temp);
			}
		}
		
		public static void printIntegerTillDesiredNumber(int n) {
			for(int i=-n;i<=n;i++) {
				System.out.println(i);
			}
		}
		
		public static void cubeOfGivenNumber(double j) {
			System.out.println("The cube of the given number is : "+(j*j*j));
		}
		
		public static void reverseDigitOfGivenNumber(long k) {
			String s= String.valueOf(k);
			String temp = "";
			for(int i=s.length()-1;i>=0;i--) {
				temp=temp+s.charAt(i);
			}
			System.out.println("The Actual digit passed was : "+k);
			System.out.println("The reversed digit is : "+Long.parseLong(temp));
		}
		
		public static void toDetermineOddOrEven(int n) {
			if(n%2==0)
				System.out.println("The number "+n+" is an even number");
			else
				System.out.println("The number "+n+" is a odd number");
		}

}

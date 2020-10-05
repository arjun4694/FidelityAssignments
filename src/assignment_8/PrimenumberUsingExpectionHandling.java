package assignment_8;

import java.util.Scanner;

public class PrimenumberUsingExpectionHandling {

	public static void main(String[] args) {
		String primeNumbers="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lower limit from where the prime numbers are to be printed");		
		int a = scan.nextInt();
		System.out.println("Enter the upper limit till where the prime numbers are to be printed");
		int b = scan.nextInt();
		try {
			if((a>b)|(a<0)|(b<=0)) {
				throw new Exception();
			}
			else {
				for(int i=a;i<=b;i++) {
					 if (isPrime(i)) {  
			              primeNumbers=primeNumbers + i + " ";
			           }  
				}
				System.out.println(primeNumbers.trim());
			}
		}catch(Exception e) {
			System.out.println("Error!!!");
			System.out.println("Please input a valid entry");
		}

	}
	
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

}

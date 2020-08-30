package additionalExercise;

import java.util.Scanner;

 class MyCalculator implements AdvancedArithmetic{

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number whose divisor is to be found");
		int n= s.nextInt();				
		System.out.println("The sum of divisor of "+n+" is : "+calc.divisor_sum(n)); 
		s.close();
	}

	@Override
	public int divisor_sum(int n) {
		int i=1; int temp=0;
		while(i<=n) {
			if(n%i==0)
				temp=temp+i;
			i++;
		}
		return temp;
	}

}

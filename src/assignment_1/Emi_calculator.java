package assignment_1;
import java.util.Scanner;

public class Emi_calculator {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
        
		double principal, rate, time,emi;
		 
		       System.out.println("Enter principal Amount: ");
		       principal = a.nextDouble();
		     
		       System.out.println("Enter rate of Interest per annum: ");
		       rate = a.nextDouble();
		     
		       System.out.println("Enter time in year: ");
		       time = a.nextDouble();
		     
		       rate=rate/(12*100);
		       time=time*12;
		     
		     
		       emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
		     
		       System.out.print("Monthly EMI amount is : "+emi);

	}

}

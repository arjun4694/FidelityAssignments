package assignment_3;

import java.util.Scanner;

class readAndDisplay {
	private String employeeName;
	private float basics;
	private float HRA;
	private float DA;
	private float percentageOfTax;
	private float finalSalary;
	
	
	public void read() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name of the employee");
		employeeName = s.nextLine();
		System.out.println("Enter the basic salary of the employee");
		basics = s.nextFloat();
		System.out.println("Enter the HRA of the employee");
		HRA = s.nextFloat();
		System.out.println("Enter the DA of the employee");
		DA = s.nextFloat();		
		System.out.println("Enter the percentageOfTax of the employee");
		percentageOfTax = s.nextFloat();
		percentageOfTax=(percentageOfTax/100)*(basics+HRA+DA);
		finalSalary=basics+HRA+DA-percentageOfTax;
	}
	
	public void display() {
		System.out.println("The Monthly Salary of  "+employeeName+" is : "+finalSalary);
	}

}

public class Employee_Salary_Calculation {

	public static void main(String[] args) {
		readAndDisplay rad = new readAndDisplay();
		rad.read();
		rad.display();

	}

}

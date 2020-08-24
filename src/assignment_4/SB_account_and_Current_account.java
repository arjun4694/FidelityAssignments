package assignment_4;

import java.util.Scanner;

//Savings Account
class SBAccount extends Account{
SBAccount(String firstName, String lastName) {
		super(firstName,lastName);
	}

final float rateofInterest=4.0f;
final int minBalance = 5000; 
static int finalAmount;  

	@Override
	public void deposit(double amount) {
		finalAmount+=amount;
		System.out.println("Amount "+amount+" has been deposited in the SB account");
		System.out.println("The current balance of the account is : "+finalAmount);
		
	}

	@Override
	public void withdraw(double amount) {
		if(finalAmount-amount<minBalance)
		{
			System.out.println();
			System.out.println("This withdrawal transaction is not successful as the amount requested "+(finalAmount-amount)+" brings the account balance less than min Balance : "+minBalance);
			return;
		}
		finalAmount-=amount;
		System.out.println("Amount "+amount+" has been withdrawan from the Current account");
		System.out.println("The current balance of the account is : "+finalAmount);
	}

	@Override
	public void display() {
		System.out.println();
		System.out.println("Savings Account opened successfully.");
		System.out.println("Account with name "+firstName  +lastName+" has been created");
		System.out.println("The Account number of the user is "+accountNumber);
		System.out.println("The current balance of the account holder is "+finalAmount);
	}
	
}



//Current Account
class CurrentAccount extends Account{
	CurrentAccount(String firstName, String lastName) {
		super(firstName,lastName);
	}

	final float rateofInterest=4.0f;
	final int minBalance = 5000;
	static int finalAmount; 
	@Override
	public void deposit(double amount) {
		finalAmount+=amount;
		System.out.println("Amount "+amount+" has been deposited in the Current account");
		System.out.println("The current balance of the account is : "+finalAmount);
		
	}

	@Override
	public void withdraw(double amount) {
		if(finalAmount-amount<minBalance)
		{
			System.out.println();
			System.out.println("This withdrawal transaction is not successful as the amount requested "+(finalAmount-amount)+" brings the account balance less than min Balance : "+minBalance);			
			return;
		}
		finalAmount-=amount;
		System.out.println("Amount "+amount+" has been withdrawan from the Current account");
		System.out.println("The current balance of the account is : "+finalAmount);
		
	}

	@Override
	public void display() {
		System.out.println();
		System.out.println("Current Account opened successfully.");
		System.out.println("Account with name "+firstName+"    " +lastName  +" has been created");
		System.out.println("The Account number of the user is "+accountNumber);
		System.out.println("The current balance of the account holder is "+finalAmount);
	}
	
}


//Parent Class
abstract class Account{
	 protected String firstName;
	 protected String lastName;
	 protected static int accountNumber=1000;
	 
	 Account(String firstName, String lastName){
		 this.firstName=firstName;
		 this.lastName=lastName;
		 Account.accountNumber=accountNumber+1;
	 }
	
	public abstract void deposit(double amount); 

	public abstract void withdraw(double amount);
	
	public abstract void display();
}

public class SB_account_and_Current_account {

	public static void main(String[] args) {
		int counter=0;
		String firstName,lastName;
		double amount;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the type of account to be created \nClick 1 for SB Account \nClick 2 for Current Account");
		int b = a.nextInt();
		switch(b) {
		case 1:{
			System.out.println("Enter Name of the Account holder");
			firstName = a.next();
			System.out.println("Enter First name of the Account holder");
			lastName = a.next();
			System.out.println("Enter the amount to be deposited in the account");
			amount = a.nextDouble();
			while(amount<5000) {
				System.out.println("Account not created \nThe minimum amount to be deposited to create an account is 5000 \nPlease enter a valid amount");
				if(counter>2) {
					System.out.println("Max try exceeded please try after sometime");
					break;
				}
				System.out.println("Enter the amount to be deposited in the account");
				 amount = a.nextInt();
				counter++;
			}
			SBAccount sb = new SBAccount(firstName,lastName);
			sb.deposit(amount);
			sb.display();
			System.out.println();
			System.out.println("Click 1 to deposit        Click 2 to withdraw");
			int transaction = a.nextInt();
			if(transaction==1)
			{
				System.out.println("Enter the amount to be deposited");
				double amt = a.nextDouble();
				sb.deposit(amt);
			}
			else if(transaction==2) {
				System.out.println("Enter the amount to be Withdrawn");
				double amt = a.nextDouble();
				sb.withdraw(amt);
			}
			else {
				System.out.println("Incorrect Entry");
			}
						
			break;
		}
		case 2:{
			System.out.println("Enter First name of the Account holder");
			 firstName = a.next();
			 System.out.println("Enter First name of the Account holder");
			 lastName = a.next();
			 System.out.println("Enter the amount to be deposited in the account");
			amount = a.nextDouble();
			while(amount<5000) {
				System.out.println("Account not created \n The minimum amount to be deposited to create an account is 5000 \n Please enter a valid amount");
				if(counter>2) {
					System.out.println("Max try exceeded please try after sometime");
					break;
				}
				counter++;
			}
			CurrentAccount ca = new CurrentAccount(firstName,lastName);
			ca.deposit(amount);
			ca.display();
			System.out.println();
			System.out.println("Click 1 to deposit        Click 2 to withdraw");
			int transaction = a.nextInt();
			if(transaction==1)
			{
				System.out.println("Enter the amount to be deposited");
				double amt = a.nextDouble();
				ca.deposit(amt);
			}
			else if(transaction==2) {
				System.out.println("Enter the amount to be Withdrawn");
				double amt = a.nextDouble();
				ca.withdraw(amt);
			}
			else {
				System.out.println("Incorrect Entry");
			}		
			
			break;
		}	
		default:
			System.out.println("Please select a valid entry");
			
		}

	}

}

package assignment_7;

import java.util.Scanner;

public class ReadInputJavaConsole {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  data to be printed on the console");
		String data = scan.next();
		System.out.println("The data read from the console is : \n"+data);
		scan.close();
	}

}

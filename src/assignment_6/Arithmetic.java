package assignment_6;

public class Arithmetic {

	public static void main(String[] args) {
		try {
			int a=1,c;
			c=a/0;
		}catch(ArithmeticException e) {
			System.out.println("The denominator cannot be Zero");
		}

	}

}

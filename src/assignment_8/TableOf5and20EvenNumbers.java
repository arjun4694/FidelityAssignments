package assignment_8;


public class TableOf5and20EvenNumbers {

	public static void main(String[] args) {
		String evenumbers="";
		Runnable r = new Runnable1();
		Thread t = new Thread(r);
		t.start();
		for(int i=2;i<=20;i++) {
			if(i%2==0)
				evenumbers=evenumbers+i+" ";
		}
		System.out.println("The even numbers till 20 are : \n"+evenumbers);
	}
}

class Runnable1 implements Runnable {
	int x;
	public void run() {
		System.out.println("The tables of 5 are :");
		for (int i = 1; i < 11; i++) {
			 x= 5*i;
			System.out.println("5 * "+i+" = "+x);
		}
	}
}
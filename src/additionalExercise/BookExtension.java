package additionalExercise;

import java.util.Scanner;

 class BookExtension extends Book {	

	public static void main(String[] args) {
		BookExtension  book = new BookExtension();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the title of the book");
		String s = in.nextLine();
		book.setTitle(s);
		System.out.println("The title of the book is : "+book.getTitle());
		in.close();
	}

	@Override
	void setTitle(String s) {
		title=s;
	}

}

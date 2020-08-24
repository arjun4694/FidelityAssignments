package assignment_5;

interface  add_and_subtract{
	void insert();
	void delete();
}

class queue implements add_and_subtract{

	@Override
	public void insert() {
		System.out.println("This is an interface implemented insert method");
	}

	@Override
	public void delete() {
		System.out.println("This is an interface implemented delete method");
	}
	
}
public class Queue_Interface {

	public static void main(String[] args) {
		queue q= new queue();
		q.insert();
		q.delete();
	}

}

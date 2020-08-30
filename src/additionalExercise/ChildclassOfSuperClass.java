package additionalExercise;

public class ChildclassOfSuperClass extends SuperClass{
	
	public void mainClass() {
		super.mainClass();
		System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
	}

	public static void main(String[] args) {
		ChildclassOfSuperClass child = new ChildclassOfSuperClass();
		child.mainClass();
	}
}

package assignment_6;

class ParentClass{	
}

class ChildClass extends ParentClass{	
}


public class ClassCast {
	public static void main(String[] args) {
		try {
			ParentClass p = new ParentClass();
			ChildClass c= (ChildClass)p;
		}catch(ClassCastException e) {
			e.printStackTrace();
		}

	}

}

package assignment_6;

public class NullPointer {

	public static void main(String[] args) {
		String ptr = null; 
		try {
			if(ptr.equals("abc"));
		}catch(NullPointerException e) {
			e.printStackTrace();
		}

	}

}

package assignment_7;

import java.io.File;

public class ListOfFileOrDirectory {

	public static void main(String[] args) {
		 File file = new File("C:\\Users\\User");
		 String[] fileList = file.list();
	        for(String name:fileList){
	         System.out.println(name);
	        }
	}

}

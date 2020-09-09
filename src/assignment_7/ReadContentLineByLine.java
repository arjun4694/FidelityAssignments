package assignment_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadContentLineByLine {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\git\\FidelityAssignments\\src\\data.txt");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		int data;
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}	

	}

}

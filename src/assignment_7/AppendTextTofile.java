package assignment_7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppendTextTofile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\git\\FidelityAssignments\\src\\data.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		String a = " is my name .";
		fos.write(a.getBytes());
		fos.flush();
		fos.close();

	}

}

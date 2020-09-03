package assignment_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFound {

	public static void main(String[] args) throws IOException {		
			File file = new File("data.txt");
			FileInputStream fis = null;
			try{
				fis = new FileInputStream(file);
				while (fis.read()!=-1){
					System.out.println(fis.read());
				}
			}catch (FileNotFoundException e){
				e.printStackTrace();
			}
	}

}

package assignment_7;

import java.io.File;
import java.util.Scanner;

public class FileOrDirectoryExist {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the file to be searched");
		String file=scan.next();
		 File myFile = new File("C:\\Users\\User\\"+file);
         if (myFile.exists()) 
           {
            System.out.println("The directory or file exists.");
           } 
         else
          {
            System.out.println("The directory or file does not exist.");
          }
         scan.close();
	}

}

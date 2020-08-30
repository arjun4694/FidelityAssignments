package additionalExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rightangeledtriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the three sides of the triangle separated by comma");
		String sides=s.nextLine();
		String [] splitSides=sides.split(",");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<splitSides.length;i++) {
			list.add(Integer.parseInt(splitSides[i].trim()));
		}
		 Collections.sort(list,Collections.reverseOrder());
		 if((Math.pow(list.get(0), 2))==(Math.pow(list.get(1), 2))+(Math.pow(list.get(2), 2))) 
			 System.out.println("The provided input are edges of right angeled triange i.e., \n" +Math.pow(list.get(0), 2)+" = " +Math.pow(list.get(1), 2)+" + " +Math.pow(list.get(2), 2));
		 else
			 System.out.println("The provided input are not the edges of right angeled triange i.e., \n " +Math.pow(list.get(0), 2)+" = " +Math.pow(list.get(1), 2)+" + " +Math.pow(list.get(2), 2));
		 
	}

}

package additionalExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class MissingAlphabets {
	 enum smallAlphabets{
		 a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	 }
	 
	  	

	public static void main(String[] args) {
		String temp="";
		List<smallAlphabets> list = Arrays.asList(smallAlphabets.values());
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sequence of alphabets to find the missing alphabet separated by Comma");
		String alpha = scan.next();
		List<String> split = new ArrayList(Arrays.asList(alpha.split(",")));
		TreeSet<String> splitAlphabet = new TreeSet<String>(split);
	}
}

package in.arun;

import java.util.Iterator;

public class StringRev {

	public static void main(String[] args) {
		String str = "Arun";
		
		String rev ="";
		
		for (int i = str.length()-1; i>=0; i--) {
			
			rev = rev+str.charAt(i);	
		}
		System.out.println(rev);
	}
}

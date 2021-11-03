package exercises.week10;

import java.util.*;

public class Enumeration1 {
	public static void printEnumeration(Enumeration e) {
		while (e.hasMoreElements()) {
			System.out.println("" + e.nextElement());
		}
	} 

	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 10; i++) { 
			v.add(i); 
		}
		
		Enumeration e = v.elements(); 
		Enumeration1.printEnumeration(e);
	}
}

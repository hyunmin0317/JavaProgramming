package exercises.week10;

import java.util.*;

public class Iterator2 {
	public static void printIterator(Iterator it) {
		while (it.hasNext()) {
			System.out.println("" + it.next());
		}
	}

	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 10; i++) { 
			v.add(i); 
		}

		Enumeration e = v.elements();
		EnumerationIterator it = new EnumerationIterator(e);
		Iterator2.printIterator(it);
	}
}

package exercises.week07;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators{
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		Iterator iter;
		
		cities.add("Seoul");
		cities.add("Tokyo");
		cities.add("Washington D.C.");
		cities.add("Beijing");

		iter = cities.iterator();
		
		System.out.println("while문");
		while (iter.hasNext()) {
			String s = (String) iter.next();
			System.out.println(s);
		}
		
		System.out.println("\nfor문");
		for (Iterator iters = cities.iterator(); iters.hasNext();) {
			String s = (String) iters.next();
			System.out.println(s);
		}
	}

}

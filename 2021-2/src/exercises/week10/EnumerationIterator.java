package exercises.week10;

import java.util.*;

public class EnumerationIterator implements Iterator {
	Enumeration enumeration;
	
	public EnumerationIterator(Enumeration enmt) {
		this.enumeration = enmt;
	}

	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	public Object next() {
		return enumeration.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}

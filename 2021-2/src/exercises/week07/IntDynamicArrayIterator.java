package exercises.week07;

import java.util.Iterator;
import java.util.function.Consumer;

public class IntDynamicArrayIterator implements Iterator {
	IntDynamicArray arr;
	int count;

	public IntDynamicArrayIterator(IntDynamicArray arr) {
		this.arr = arr;
		count = 0;
	}

	@Override
	public boolean hasNext() {
		return count < arr.size();
	}

	@Override
	public Object next() {
		Integer n = arr.get(count);
		count++;
		return n;
	}
}

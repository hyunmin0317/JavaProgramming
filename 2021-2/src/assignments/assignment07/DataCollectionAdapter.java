package assignments.assignment07;

import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T> {
	ArrayList<T> list;
	
	public DataCollectionAdapter() {
		list = new ArrayList<T>();
	}

	@Override
	public boolean put(T t) {
		list.add(t);
		return true;
	}

	@Override
	public T elemAt(int index) {
		return list.get(index);
	}

	@Override
	public int length() {
		return list.size();
	}

	@Override
	public Iterator createIterator() {
		return new DynamicArrayIterator(this);
	}

}

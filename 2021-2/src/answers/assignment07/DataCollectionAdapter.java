package answers.assignment07;

import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T>, Iterable<T> {
	ArrayList<T> list;
	
	public DataCollectionAdapter(ArrayList<T> list) {
		this.list = list;
	}
	
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	@Override
	public boolean put(T t) {
		return list.add(t);
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
		return list.iterator();
	}

}

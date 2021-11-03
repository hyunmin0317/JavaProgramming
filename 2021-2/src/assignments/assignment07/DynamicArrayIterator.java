package assignments.assignment07;

import java.util.Iterator;

public class DynamicArrayIterator implements Iterator {
    private DataCollection array;
    private int index;

    public DynamicArrayIterator(DataCollection arr) {
        array = arr;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index < array.length());
    }

    @Override
    public Object next() {
        Object obj = array.elemAt(index);
        index++;
        return obj;
    }

    @Override
    public void remove() {
        //throw new UnsupportedOperationException();
    }
}

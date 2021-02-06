package advanced.lesson4;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T>{
	private Integer cursor = 0;
	private List<T> list;
    
    public MyIterator(List<T> list) {
        this.list = list;
    }

	@Override
	public boolean hasNext() {
		return cursor < list.size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}

		@SuppressWarnings("unchecked")
		T val = (T) list.get(cursor);
		cursor = cursor +2;

		return val;
	}
}

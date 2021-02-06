package advanced.lesson4;

import java.util.Iterator;
import java.util.List;

public class MyList implements Iterable<Integer> {
	 private List<Integer> list;

	 MyList(List<Integer> list) {
	  this.list = list;
	 }

	 public Iterator<Integer> iterator() {
	  return new MyIterator<>(list);
	 }
}

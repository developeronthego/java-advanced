package advanced.lesson12;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ImmutableClass {
	private final int intValue;
	private final Date date;
	private final List<String> strings;
	private final String myString;
	
	public ImmutableClass(int intValue, Date date, List<String> strings, String myString) {
		this.intValue = intValue;
		this.date = new Date(date.getTime());
		this.strings = Collections.unmodifiableList(strings);
		this.myString = myString; //String is immutable also, you don't have to create new object
	}

	public int getIntValue() {
		return intValue;
	}

	public Date getDate() {
		return new Date(date.getTime());
	}

	public List<String> getStrings() {
		return strings;
	}

	public String getMyString() {
		return myString;
	}
	
}

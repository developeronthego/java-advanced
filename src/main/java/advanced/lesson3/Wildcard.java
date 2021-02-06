package advanced.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<?> wildcardList = new ArrayList<>();
		// wildcardList.add("test"); blad, nie mozesz wrzucic do listy elementu typu String

		List<Employee> employees = new ArrayList<>();
		useWildcardList(employees);
		//useWildcardList(wildcardList); blad, nie dziedziczy po Employee
	}
	
	public static void useWildcardList(List<? extends Employee> emloyeesAndOthers) {
	}

}

package advanced.lesson15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableStructure {

	public static void main(String[] args) {
		List<String> shoes = new ArrayList<>();
		Collections.addAll(shoes, "Adidas", "Nike", "New balance");
		List<String> finalListOfShoes = Collections.unmodifiableList(shoes);
		System.out.println("Unmodifiable list of shoes: " + finalListOfShoes);
		// finalListOfShoes.add("Reebok"); UnsupportedOperationException
		shoes.add("Reebok");
		System.out.println("Modifiable list of shoes: " + finalListOfShoes);
	}
}

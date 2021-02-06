package advanced.lesson1;

public class Restaurant<ui, U> {
	ui category;
	U id;
	
	public ui getCategory() {
		return category;
	}

	public void setCategory(ui category) {
		this.category = category;
	}

	public U getId() {
		return id;
	}
	
	public void setId(U id) {
		this.id = id;
	}
	
}

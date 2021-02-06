package advanced.lesson2;

public class Restaurant<T extends Orderable, U> {
	T category;
	U id;
	
	public T getCategory() {
		return category;
	}
	public void setCategory(T category) {
		this.category = category;
	}
	public U getId() {
		return id;
	}
	
	public void setId(U id) {
		this.id = id;
	}
}

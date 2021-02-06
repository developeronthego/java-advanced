package advanced.lesson6;

public class ApiMain {

	public static void main(String[] args) throws IllegalAccessException {
		InternalApi api = new InternalApi("18.1.1", "RC", "Spring core");
		System.out.println(api);
		System.out.println(JsonSerializer.serialize(api));
	}

}

package advanced.lesson6;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class JsonSerializer {
	public static String serialize(Object object) throws IllegalAccessException {
		Class<?> objectClass = object.getClass();
		Map<String, String> jsonElements = new HashMap<>();

		for (Field field : objectClass.getDeclaredFields()) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(JsonField.class)) {
				jsonElements.put(getSerializedKey(field), (String) field.get(object));
			}
		}

		return toJsonString(jsonElements);
	}

	private static String toJsonString(Map<String, String> jsonMap) { 
		StringBuilder elementsStringBuilder = new StringBuilder("");
		
		for (Map.Entry<String, String> element : jsonMap.entrySet()) {
			elementsStringBuilder.append("\"," + element.getKey() + "\":\"" + element.getValue());
		}
		String elementsString = elementsStringBuilder.toString().replaceFirst(",", "");
	
		return "{" + elementsString + "}";
	}

	private static String getSerializedKey(Field field) {
		String annotationValue = field.getAnnotation(JsonField.class).value();
		if (annotationValue.isEmpty()) {
			return field.getName();
		} else {
			return annotationValue;
		}
	}
}
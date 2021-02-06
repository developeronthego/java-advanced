package advanced.lesson5;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionMain {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> classByReflection = Class.forName(Shop.class.getName());
		while(classByReflection != null) {
			for (Method method : classByReflection.getDeclaredMethods()) {
				System.out.println(
						Modifier.toString(method.getModifiers()) + " "
								+ method.getReturnType().getCanonicalName() + " "
								+ method.getName() + " "
								+ Arrays.toString(method.getParameters()));
			}
			classByReflection = classByReflection.getSuperclass();
		}
	}

}

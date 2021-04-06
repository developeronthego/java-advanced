package advanced.lesson14;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class VolatileVariable {
	private static volatile boolean done = false;
	
	public static void main(String[] args) {
		Runnable starting = () -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Counter: " + i);
			}
			done = true;
		};
		
		Runnable ending = () -> {
			int i = 1;
			while(!done) i++;
			System.out.println("Last item: " + i);
		};
		
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(starting);
		executor.execute(ending);
	}
}

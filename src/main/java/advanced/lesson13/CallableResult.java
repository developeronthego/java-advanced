package advanced.lesson13;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableResult implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Thread.sleep(1000); // only for simulating complex calculation
		return new Random().nextInt(100000); // draw a random number
	}

}

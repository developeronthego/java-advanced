package advanced.lesson9;

import java.util.logging.Logger;

public class CustomRunnable implements Runnable{
	private static final Logger LOGGER = Logger.getLogger(CustomRunnable.class.getName());

	@Override
	public void run() {
		LOGGER.info("Thread " + Thread.currentThread().getName() + " was started");
	}

}

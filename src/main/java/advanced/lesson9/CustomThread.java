package advanced.lesson9;

import java.util.logging.Logger;

public class CustomThread extends Thread{
	private static final Logger LOGGER = Logger.getLogger(CustomThread.class.getName());

	@Override
	public void run() {
		LOGGER.info("Thread " + Thread.currentThread().getName() + " was started");
			
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			LOGGER.info("Thread " + Thread.currentThread().getName() + " was stopped by exception or error.");
		}
		LOGGER.info("Thread " + Thread.currentThread().getName() + " finished his work.");
	}
}

package advanced.lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import advanced.lesson11.CounterThread;

public class ExecutorServiceRunner {
	private static final int THREAD_POOL_SIZE = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws InterruptedException {
    	ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        for (int i = 0; i < THREAD_POOL_SIZE; i++) {
            executorService.execute(new CounterThread());
        }
        executorService.shutdown();
    }
}

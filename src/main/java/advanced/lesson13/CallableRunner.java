package advanced.lesson13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableRunner {
    private static final int TIMEOUT = 60000;
	private static final int THREAD_POOL_SIZE = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
    	ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    	int sum = 0;
        for (int i = 0; i < THREAD_POOL_SIZE; i++) {
            int partialResult = executorService.submit(new CallableResult()).get();
            System.out.println("Partial result for thread number: " + i  + " is " + partialResult);
            sum += partialResult;
        }
        executorService.shutdown();
        if (!executorService.awaitTermination(TIMEOUT, TimeUnit.MILLISECONDS)) {
            System.err.println("Error, thread didn't shutdown after " + TIMEOUT + " miliseconds.");
        }
        
        System.out.println("Final result is " + sum);
    }	

}

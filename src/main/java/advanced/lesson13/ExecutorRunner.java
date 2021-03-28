package advanced.lesson13;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import advanced.lesson11.CounterThread;

public class ExecutorRunner {

    public static void main(String[] args) {
    	Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(new CounterThread());
    }

}

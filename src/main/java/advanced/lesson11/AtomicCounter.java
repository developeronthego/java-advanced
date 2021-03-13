package advanced.lesson11;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private static AtomicInteger counter = new AtomicInteger(0);

    public void incrementCounter() {
        synchronized (counter) {
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter.incrementAndGet();
        }
    }
    
    public static int getCounter() {
		return counter.get();
	}
}

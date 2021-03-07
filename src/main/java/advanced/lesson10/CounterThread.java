package advanced.lesson10;

public class CounterThread extends Thread {
    private static final int LIMIT = 1000;
    
    @Override
    public void run() {
    	SynchronizedCounter counter = new SynchronizedCounter();
        while (SynchronizedCounter.getCounter() < LIMIT) {
        	counter.incrementCounter();
        }
    }
}

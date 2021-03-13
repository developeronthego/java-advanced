package advanced.lesson11;

public class CounterThread extends Thread {
    private static final int LIMIT = 20;
    
    @Override
    public void run() {
    	CounterLock counter = new CounterLock();
        while (CounterLock.getCounter() < LIMIT) {
        	counter.incrementCounter();
        }
    }
}

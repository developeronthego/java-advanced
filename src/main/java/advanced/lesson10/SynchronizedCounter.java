package advanced.lesson10;

public class SynchronizedCounter {
    private static int counter = 0;
    private static final Object lock = new Object();

    public void incrementCounter() {
        synchronized (lock) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " : " + counter);
        }
    }
    
    public static int getCounter() {
		return counter;
	}
}

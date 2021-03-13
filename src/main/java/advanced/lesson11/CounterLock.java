package advanced.lesson11;

import java.util.concurrent.locks.ReentrantLock;

class CounterLock {
    private static int counter = 0;
    private static final ReentrantLock lock = new ReentrantLock();

    public void incrementCounter() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter++;
        } finally {
        	lock.unlock();
        }
    }
    
    public static int getCounter() {
		return counter;
	}
}

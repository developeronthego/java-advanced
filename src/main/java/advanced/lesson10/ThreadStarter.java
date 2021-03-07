package advanced.lesson10;

public class ThreadStarter {

	public static void main(String[] args) {
		CounterThread firstCounter = new CounterThread();
		firstCounter.setName("number one");
		firstCounter.start();
		CounterThread secondCounter = new CounterThread();
		secondCounter.setName("number two");
		secondCounter.start();
		CounterThread thirdCounter = new CounterThread();
		thirdCounter.setName("number three");
		thirdCounter.start();
	}
}

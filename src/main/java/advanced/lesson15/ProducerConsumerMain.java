package advanced.lesson15;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerMain {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

		Producer producer = new Producer(queue);
		Consumer consumer1 = new Consumer(queue);
		Consumer consumer2 = new Consumer(queue);

		new Thread(producer).start();

		Thread.sleep(4000);
		new Thread(consumer1).start();
		new Thread(consumer2).start();
	}
}

package advanced.lesson15;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("Start consuming");
		try {
			while (!queue.isEmpty()) {
				System.out.println("Consume " + queue.take());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

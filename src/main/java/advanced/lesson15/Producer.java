package advanced.lesson15;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("Start producing");
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("Produce " + i);
				queue.put(i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

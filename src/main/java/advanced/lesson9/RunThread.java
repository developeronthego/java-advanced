package advanced.lesson9;


public class RunThread {

	public static void main(String[] args) throws InterruptedException {
		CustomThread thread = new CustomThread();
		thread.setName("first");
		thread.start();

		CustomThread threadTwo = new CustomThread();
		threadTwo.setName("second");
		threadTwo.start();
		
		thread.interrupt();
	}

}

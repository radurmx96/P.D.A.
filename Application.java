
public class Application {

	public Thread producerThread;
	public Thread consumerThread;

	public static void main(String[] args) throws InterruptedException {
		
		new Application().start();
	}

	private void start() throws InterruptedException {

		manageThreads();
	}

	public void manageThreads() throws InterruptedException {

		initThreads();
		startThreads();
		joinThreads();
	}

	public void initThreads() {

		Stack stack = new Stack(5);

		Producer producedElement = new Producer(stack);
		producerThread = new Thread(producedElement);

		Consumer consumedElement = new Consumer(stack);
		consumerThread = new Thread(consumedElement);
	}

	private void joinThreads() throws InterruptedException {

		producerThread.join();
		consumerThread.join();
	}

	private void startThreads() {

		producerThread.start();
		consumerThread.start();
	}

}

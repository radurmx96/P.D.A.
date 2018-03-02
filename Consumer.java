package model;

public class Consumer extends Thread {

	public Stack stack;

	public Consumer(Stack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (stack) {
				try {
					while (stack.isEmpty()) {
						System.out.println("The stack is empty.");
						stack.wait();
					}
				} catch (Exception e) {
					/// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.print("Element removed --- ");
				stack.printEmptySlotsAndElement();
				System.out.println(" removed");
				stack.pop();
				
			}
			
			try {
				sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

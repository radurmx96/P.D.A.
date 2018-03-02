package model;

public class Producer extends Thread {

	public Stack stack;

	public Producer(Stack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (stack) {
				try {
					while (stack.isFull()) {
						System.out.println("The stack is full.");
						stack.wait();
					}
				} catch (Exception e) {
					/// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.print("Element added --- ");
				stack.printEmptySlotsAndElement();
				System.out.println(" added");
				stack.push();
			}
			
			try {
				sleep(3500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

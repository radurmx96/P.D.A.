import java.util.LinkedList;
import java.util.Queue;

public class Stack {
	int maxSize;
	private Queue<Integer> queue; 
	
	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		queue = new LinkedList<>();
	}

	public boolean isFull() {
		return queue.size() == maxSize;
	}

	public void push() {
		queue.add(1);
		notifyAll();
	}

	public void pop() {
		notifyAll();
		queue.remove();
		
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
}

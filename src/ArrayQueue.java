

public class ArrayQueue<E> implements Queue<E> {

	final private int CAPACITY = 10;
	private E[] items;
	private int front;
	private int numItems;
	
	// constructor
	public ArrayQueue() {
		front = 0;
		numItems = 0;
		items = (E[]) new Object[CAPACITY];
	}
	
	@Override
	public void enqueue(E item) {
		if (numItems == CAPACITY) {
			throw new Error("Queue is full!");
		}
		int position = (front + numItems) % CAPACITY;
		items[position] = item;
		numItems += 1;
	}

	@Override
	public E dequeue() {
		E result = items[front];
		front = (front + 1) % CAPACITY;
		numItems -= 1;
		return result;
	}

	@Override
	public E first() {
		return items[front];
	}

	@Override
	public boolean isEmpty() {
		return (numItems == 0);
	}

	
}

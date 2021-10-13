
public class ArrayStack<E> implements Stack<E> {
	
	final private int CAPACITY = 100;
	private E[] items;
	private int numItems;
	
	// constructor
	public ArrayStack() {
		items = (E[]) new Object[CAPACITY];
		numItems = 0;
	}

	@Override
	public void push(E item) {
		items[numItems] = item;
		numItems++;
	}
		
	@Override
	public E pop() {
		numItems--;
		return items[numItems];
	}

	@Override
	public E top() {
		return items[numItems-1];
	}

	@Override
	public boolean isEmpty() {
		return (numItems == 0);
	}
	

}

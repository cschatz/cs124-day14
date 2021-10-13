
import net.datastructures.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E> {

	private SinglyLinkedList<E> list;
	
	// constructor
	public LinkedStack() {
		list = new SinglyLinkedList<E>();
	}
	
	@Override
	public void push(E item) {
		list.addFirst(item);
	}

	@Override
	public E pop() {
		return list.removeFirst();
	}

	@Override
	public E top() {
		return list.first();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
}

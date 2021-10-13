import net.datastructures.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E> {

	private SinglyLinkedList<E> list;
	
	// constructor
	public LinkedQueue() {
		list = new SinglyLinkedList<E>();
	}
	
	@Override
	public void enqueue(E item) {
		list.addLast(item);
	}

	@Override
	public E dequeue() {
		return list.removeFirst();
	}

	@Override
	public E first() {
		return list.first();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

}

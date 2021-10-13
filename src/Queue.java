
public interface Queue<E> {
	public abstract void enqueue(E item);
	public abstract E dequeue();
	public abstract E first();
	public abstract boolean isEmpty();
}

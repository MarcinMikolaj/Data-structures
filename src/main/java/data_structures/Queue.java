package data_structures;

import java.util.Collection;

public interface Queue<T> {
	
	// The method is used to insert element at the end of the queue.
	// Return true if operation was successful.
	// Throws IllegalStateException if element cannot be added.
	public boolean add(T object);
	
	// Works similarly to add(TO object), but inserts the added elements into the stream.
	public boolean addAll(Collection<T> collection);
	
	// The method is used to remove the element at the front of the queue.
	// Return removed element or throw IllegalStateException if queue is empty.
	public T remove();
	
	// Perform the same operation like remove(), but when queue is empty return null.
	public T poll();
	
	// The method is used to  retreives, but doesn't remove element at the front of this queue.
	// If queue is empty return null.
	public T peek();
	
	// Perform the same operation as the peek() method, but throws NoSuchElementException if queue is empty.
	public T element();
	
	// Return true if queue is empty otherwise return false.
	public boolean isEmpty();
	
	// If queue is full return true otherwise return false.
	public boolean isFull();
	
	// Return actual size or number of elements int the queuee.
	public int size();
	
	// Return all queue elements as array.
	// If queue is empty return null.
	public T[] toArray();

}

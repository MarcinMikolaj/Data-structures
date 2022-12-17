package data_structures.impl;

import java.util.Collection;
import java.util.NoSuchElementException;

import data_structures.Queue;

public class QueueArrayImpl<T> implements Queue<T> {
	
	// Array contains all elements of this queue.
	private T[] buffor;
	
	// Points to max size of this queue.
	private final int capacity;
	
	// Points to the element at the front of the queue.
	private int front; 
	
	// Points to the element at the end of the queue.
	private int rear;
	
	public QueueArrayImpl(int capacity) {
		this.buffor = (T[]) new Object[capacity];
		this.capacity = capacity;
		this.front = -1;
		this.rear = -1;
	}

	
	// The method is used to insert element at the end of the queue.
	// Return true if operation was successful.
	// Throws IllegalStateException if element cannot be added.
	@Override
	public boolean add(T object) {
		
		if(isFull())
			throw new IllegalStateException("QueueArrayImpl: You can't add new element if queue is full.");
		
		if(front == -1)
			front = 0;
		
		buffor[++rear] = object;
		
		return true;
	}

	
	// The method is used to remove the element at the front of the queue.
	// Return removed element.
	@Override
	public T remove() {
		
		T element;
		
		if(isEmpty())
			throw new IllegalStateException("QueueArrayImpl: You can't remove element if queue is empty.");
		
		element = buffor[rear];
		
		if(rear == 0)
			front = -1;
		
		buffor[rear] = null;
		rear--;
		
		return element;
	}
	
	// Perform the same operation like remove(), but when queue is empty return null.
	@Override
	public T poll() {
		
		T element;
		
		if(isEmpty())
			return null;
		
        element = buffor[rear];
		
		if(rear == 0)
			front = -1;
		
		buffor[rear] = null;
		rear--;
		
		return element;
	}

	
	// The method is used to  retreives, but doesn't remove element at the front of this queue.
	// If queue is empty return null.
	@Override
	public T peek() {
		
		if(isEmpty())
			return null;
		
		return buffor[rear];
	}

	
	// Perform the same operation as the peek() method, but throws NoSuchElementException if queue is empty.
	@Override
	public T element() {
		
		if(isEmpty())
			throw new NoSuchElementException("QueueArrayImpl: You can't get element if queue is empty.");
		
		return buffor[rear];
	}
	
	
	// If queue is full return true otherwise return false.
	@Override
	public boolean isFull() {
		return (capacity-1 == rear);
	}

	
	// Return true if queue is empty otherwise return false.
	@Override
	public boolean isEmpty() {
		
		return (rear <= -1);
	}

	
	// Return actual size or number of elements int the queuee.
	@Override
	public int size() {
		
		return rear+1;
	}


	@Override
	// Return all queue elements as array.
	// If queue is empty return null.
	public T[] toArray() {
		
		if(isEmpty())
			return null;
		
		return this.buffor;
	}


	// Works similarly to add(TO object), but inserts the added elements into the stream.
	@Override
	public boolean addAll(Collection<T> collection) {
		
		if(isFull())
			throw new IllegalStateException("QueueArrayImpl: You can't add new element if queue is full.");
		
		collection.forEach(e -> add(e));
	
		return true;
	}
	
}

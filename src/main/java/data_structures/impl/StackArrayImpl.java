package data_structures.impl;

import data_structures.Stack;

public class StackArrayImpl<T> implements Stack<T>{
	
	private int top;
	private int maxStockSize;
	private T[] buffer;
	
	public  StackArrayImpl(int maxStockSize) {
		this.top = -1;
		this.maxStockSize = maxStockSize;
		this.buffer = (T[]) new Object[maxStockSize];	
		
	}

	// Allow add new element to the top of stack.
	// If stock is full throw ArrayIndexOutOfBoundsException.
	// Return pushed element.
	public T push(T object) {
		
		if(isFull())
			throw new ArrayIndexOutOfBoundsException("Cannot add an item if stack is full");
		
		top++;
		this.buffer[top] = object;
		
		return object;
	}

	// Return removed element.
	// If Stack is empty return null.
	public T pop() {
		
		if(isEmpty())
			return null;
		
		return buffer[top--];
	}
	
	// If stack is not empty return element on the top of the stack.
	// If stack is empty return null.
	public T peek() {
	
		if(isEmpty())
			return null;
		
		return buffer[top];
	}
	

	// Return stack max size.
	public int getMaxSize() {
		return maxStockSize;
	}

	public void clear() {
		
		for(int i = 0; i < top; i++) {
			buffer[i] = null;
		}
		
		top = 0;
		
	}

	// Return true is satck is full otherwise return false;
	public boolean isFull() {
		return (top == maxStockSize-1);
	}

	// Return true if satck is empty otherwise return false.
	public boolean isEmpty() {
		return (top == -1);
	}

}

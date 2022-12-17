package data_structures;

public interface Stack<T> {
	
	// Allow add new element to the top of stack.
	// If stock is full throw ArrayIndexOutOfBoundsException.
	// Return pushed element.
	public T push(T object);
	
	// Return removed element.
	// If Stack is empty return null.
	public T pop();
	
	// If stack is not empty return return element on the top of the stack.
	// If stack is empty return null.
	public T peek();
	
	public void clear();
	
	//Return stack max declared size.
	public int getMaxSize();
	
	// Return true is satck is full otherwise return false;
	public boolean isFull();
	
	// Return true if satck is empty otherwise return false.
	public boolean isEmpty();
	
}

package data_structures;

import org.junit.jupiter.api.Test;

import data_structures.impl.StackArrayImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackArrayImplTest {
	
	//Test push(T object)
	@Test
	void pushMethodAfterAddElementToStackShoulReturnThisElement() {
			
		//Given
		Stack<Integer> stack = new StackArrayImpl<Integer>(5);
			
		//When
		Integer result = stack.push(1);
			
		//Then
		assertEquals(result, 1);
				
	}
	
	//Test peek()
	@Test
	void peekMethodShouldReturnLastAddedElementToStack() {
				
		//Given
		Stack<Integer> stack = new StackArrayImpl<Integer>(5);
				
		//When
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Integer result = stack.peek();
				
		//Then
		assertEquals(result, 3);
		
	}
	
	//Test remove()
	@Test
	void peekMethodAfterRemoveElementFromStackShouldReturnCorrectElement() {
					
		//Given
		Stack<Integer> stack = new StackArrayImpl<Integer>(5);
					
		//When
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		Integer result = stack.peek();
					
		//Then
		assertEquals(result, 2);
			
		}
	
	//Test isEmpty() and push(T objet) method
	@Test
	void stackAfterPushNewElementShouldBeNotEmpty() {
		
		//Given
		Stack<Integer> stack = new StackArrayImpl<Integer>(5);
		
		//When
		stack.push(2);
		boolean result = stack.isEmpty();
		
		//Then
		assertEquals(result, false);
		
		
	}
	
	//Test isEmpty() method
	@Test
	void stackAfterInvokeIsEmptyMethodShouldReturnTrue() {
		
		//Given
		Stack<String> stack = new StackArrayImpl<String>(10);
		
		//When
		boolean result = stack.isEmpty();
		
		//Then
		assertEquals(result, true);
	}
	
	//Test isFull() method
	@Test
	void isFullMethodAfterAddElementsShouldReturnTrue() {
			
		//Given
		Stack<String> stack = new StackArrayImpl<String>(2);
			
		//When
		stack.push("1");
		stack.push("2");
		boolean result = stack.isFull();
			
		//Then
		assertEquals(result, true);
	}
	
}

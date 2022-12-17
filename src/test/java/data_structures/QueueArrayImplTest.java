package data_structures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import data_structures.impl.QueueArrayImpl;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class QueueArrayImplTest {
	
	// Testing add() method
	@Test
	void addMethodAfterAddNewElementShouldReturnTrue() {
		
		//Given
		boolean result;
		Queue<String> queue = new QueueArrayImpl<String>(2);
		
		//When
		result = queue.add("one");
		
		//Then	
		assertEquals(result, true);
	}
	
	// Testing add() method
	@Test
	void addMethodAfterAddNewElementToFullQueueShouldThrowException() {
			
		//Given
		Queue<String> queue = new QueueArrayImpl<String>(2);
			
		//When
		queue.add("one");
		queue.add("one");
			
		//Then	
		assertThrows(IllegalStateException.class, () -> queue.add("one"));
	}
	
	
	// Testing add() method
	@Test
	void queueElementsShouldBeInSpecyficOrder() {
				
		//Given
		Queue<Integer> queue = new QueueArrayImpl<Integer>(4);
				
		//When
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		Object[] array = queue.toArray();
		
		//Then	
		// Creates a matcher for arrays that matches when each item in the examined array
		// is logically equal to the corresponding item in the specified items.
		assertThat(array, arrayContaining(1,2,3,4));

	}
	
	// Testing add() method
	@Test
	void queueAfterAddElementsByAddAllMethodShouldSpecyficElements() {
					
		//Given
		Queue<Integer> queue = new QueueArrayImpl<Integer>(4);
		List<Integer> list = new ArrayList<Integer>();
		
		//When
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		queue.addAll(list);	
		Object[] array = queue.toArray();
			
		//Then	
		// Creates a matcher for arrays that matches when each item in the examined array
		// is logically equal to the corresponding item in the specified items.
		assertThat(array, arrayContaining(1,2,3,4));

		}
	
	
	// Testing remove() method
	@Test
	void queueAfterRemoveElementShouldReturnCorrectSize() {
		
		//Given
		int result;
		Queue<String> queue = new QueueArrayImpl<String>(5);
		
		//When
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		queue.remove();
		result = queue.size();
		
		//Then	
		assertEquals(result, 3);
	}
	
	// Testing remove() method
	@Test
	void queueAfterRemoveElementShouldReturnRemovedElement() {
			
		//Given
		String result;
		Queue<String> queue = new QueueArrayImpl<String>(5);
			
		//When
		queue.add("1");
		queue.add("2");
		queue.add("3");
		result = queue.remove();
			
		//Then	
		assertEquals(result, "3");
	}
	
	// Testing remove() method
	@Test
	void queueAfterRemoveElementShouldThrowException() {
				
		//Given
		Queue<String> queue = new QueueArrayImpl<String>(5);
							
		//Then	
		assertThrows(IllegalStateException.class, () -> queue.remove());
	}
	
	
	// Testing peek() method
	@Test
	void peekMethodShouldReturnNull() {
			
		//Given
		String result;
		Queue<String> queue = new QueueArrayImpl<String>(5);
			
		//When
		result = queue.peek();
			
		//Then	
		assertEquals(result, null);
	}
	
	
	// Testing peek() method
	@Test
	void peekAfterAddNewElementToQueueShouldReturnCorrectElement() {
		
		//Given
		String result;
		Queue<String> queue = new QueueArrayImpl<String>(5);
		
		//When
		queue.add("one");
		queue.add("two");
		result = queue.peek();
		
		//Then	
		assertEquals(result, "two");
	}
	
	
	// Testing element() method
	@Test
	void elementMethodShouldThrowException() {
			
		//Given
		final Queue<String> queue = new QueueArrayImpl<String>(5);
			
		//Then	
		assertThrows(NoSuchElementException.class, () -> queue.element());
	}
	
	
	// Testing size() method
	@Test
	void sizeMethodAfterAddNewElementToQeueShouldReturnCorrectSize() {
		
		//Given
		int result;
		Queue<String> queue = new QueueArrayImpl<String>(2);
		
		//When
		queue.add("one");
		queue.add("two");
		result = queue.size();
		
		//Then	
		assertEquals(result, 2);
	}
	
	// Testing isFull() method
	@Test
	void queueAfterAddNewElementsShouldBeFull() {
		
		//Given
		boolean result;
		Queue<String> queue = new QueueArrayImpl<String>(2);
		
		//When
		queue.add("one");
		queue.add("two");
		result = queue.isFull();
		
		
		//Then	
		assertEquals(result, true);
	}
	
	// Testing isFull() method
	@Test
	void queueAfterAddNewElementsShouldNotBeFull() {
			
		//Given
		boolean result;
		Queue<String> queue = new QueueArrayImpl<String>(3);
			
		//When
		queue.add("one");
		queue.add("two");
		result = queue.isFull();
			
		//Then	
		assertEquals(result, false);
	}

}

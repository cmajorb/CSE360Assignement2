package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * This class includes many test cases to make sure that each
 * method in the SimpleList class works. Two test cases have been
 * implemented for each method, one that will be successful and 
 * one that will fail.
 */
class SimpleListTest {

	/*
	 * This method will try adding 4 numbers to the list
	 * and checking the output
	 */
	@Test
	void testAddingNumbers() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		String output = list.toString();
		assertEquals("4 1 3 1",output);
	}

	/*
	 * This method will try adding two numbers to the list
	 */
	@Test
	void testAddTwoNumbers() {
		SimpleList list = new SimpleList();
		list.add(9);
		list.add(12);
		String output = list.toString();
		assertEquals("12 9",output);
	}

	/*
	 * This method will try to remove the number 2 from the list,
	 * since there are multiple occurrences
	 */
	@Test
	void testRemovingMultipleNumbers() {
		SimpleList list = new SimpleList();
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.remove(2);
		String output = list.toString();
		assertEquals("4 3",output);
	}
	
	/*
	 * This method will try removing a number that doesn't
	 * exist
	 */
	@Test
	void testRemovingNonExistantNumber() {
		SimpleList list = new SimpleList();
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.remove(9);
		String output = list.toString();
		assertEquals("4 2 3 2",output);
	}
	
	/*
	 * This method will search for the number two and should
	 * return the location of the first occurrence of the number
	 */
	@Test
	void testSearchingNumber() {
		SimpleList list = new SimpleList();
		list.add(6);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(9);
		
		int output = list.search(2);
		assertEquals(1,output);
	}
	
	/*
	 * This method will try to search for a number
	 * that is not on the list
	 */
	@Test
	void testSearchingNonExistingNumber() {
		SimpleList list = new SimpleList();
		list.add(6);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(9);
		
		int output = list.search(1);
		assertEquals(-1,output);
	}
	
	/*
	 * This method will count the numbers in a list of five
	 * numbers and test to see if it is correct
	 */
	@Test
	void testCountingFiveNumbers() {
		SimpleList list = new SimpleList();
		list.add(4);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(1);
		
		int output = list.count();
		assertEquals(5,output);
	}
	
	/*
	 * This method will try to count the numbers in the list
	 */
	@Test
	void testCountingSixNumbers() {
		SimpleList list = new SimpleList();
		list.add(4);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(1);

		int output = list.count();
		assertEquals(6,output);
	}
	
	/*
	 * This method will try printing out a list of 5 numbers
	 */
	@Test
	void testPrintingList() {
		SimpleList list = new SimpleList();
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(9);
		String output = list.toString();
		assertEquals("9 1 3 3 2",output);
	}

	/*
	 * This method will try printing out a blank list
	 */
	@Test
	void testPrintingListEmpty() {
		SimpleList list = new SimpleList();
		String output = list.toString();
		assertEquals("",output);	
	}
}

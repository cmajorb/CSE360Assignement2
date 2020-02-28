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
	void testRemoveFromOne() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.remove(1);
		int output = list.size();
		assertEquals(7,output);
	}
	
	/*
	 * This method will try removing two numbers from the list
	 * and checking size
	 */
	@Test
	void testRemoveFromThree() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.remove(1);
		list.remove(2);
		int output = list.size();
		assertEquals(5,output);
	}
	
	/*
	 * This method will try adding 4 numbers to the list
	 * and then removing two and checking the list size
	 */
	@Test
	void testRemoveTwo() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(1);
		list.remove(2);
		int output = list.size();
		assertEquals(5,output);
	}
	
	/*
	 * This method will try adding 9 numbers to the list
	 * and then removing 1 and checking the size
	 */
	@Test
	void testRemoveOneFromNine() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.remove(1);
		int output = list.size();
		assertEquals(10,output);
	}
	
	/*
	 * This method will try adding 7 numbers to the list
	 * and then removing one and checking the size
	 */
	@Test
	void testRemoveOneFromSeven() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.remove(1);
		int output = list.size();
		assertEquals(7,output);
	}
	
	/*
	 * This method will try adding 12 numbers to the list
	 * and checking the output
	 */
	@Test
	void testAddingTwelveNumbers() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		String output = list.toString();
		assertEquals("4 1 3 1 4 1 3 1 4 1 3 1 4 1 3 1 4 1 3 1",output);
	}
	
	/*
	 * This method will test the size of an empty list
	 */
	@Test
	void testSizeOfEmpty() {
		SimpleList list = new SimpleList();
		int output = list.size();
		assertEquals(10,output);
	}
	
	/*
	 * This method will try adding 10 numbers to the list
	 * and checking the size
	 */
	@Test
	void testSizeofTenNumbers() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		int output = list.size();
		assertEquals(10,output);
	}
	
	/*
	 * This method will try adding 11 numbers to the list
	 * and checking the size after appending another number
	 */
	@Test
	void testSizeofElevenNumbers() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.append(5);
		int output = list.size();
		assertEquals(15,output);
	}
	
	/*
	 * This method will try adding 16 numbers to the list
	 * and checking the size
	 */
	@Test
	void testSizeofSixteenNumbers() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.append(5);
		int output = list.size();
		assertEquals(22,output);
	}
	
	/*
	 * This method will try removing one number and checking
	 * the output
	 */
	@Test
	void testRemoveOneNumber() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.remove(1);
		String output = list.toString();
		assertEquals("",output);
	}
	
	/*
	 * This method will try adding 3 numbers to the list
	 * and checking the first one
	 */
	@Test
	void testGetFirstNumber() {
		SimpleList list = new SimpleList();
		list.add(3);
		list.add(2);
		list.add(1);
		int output = list.first();
		assertEquals(1,output);
	}
	
	/*
	 * This method will try getting the first element
	 * of an empty list
	 */
	@Test
	void testGetFirstNumberOfEmpty() {
		SimpleList list = new SimpleList();
		int output = list.first();
		assertEquals(-1,output);
	}
	
	/*
	 * This method will try getting the last element
	 * of an empty list
	 */
	@Test
	void testGetLastNumberOfEmpty() {
		SimpleList list = new SimpleList();
		int output = list.last();
		assertEquals(-1,output);
	}
	
	/*
	 * This method will try adding 3 numbers to the list
	 * and checking the last one
	 */
	@Test
	void testGetLastNumber() {
		SimpleList list = new SimpleList();
		list.add(3);
		list.add(2);
		list.add(1);
		int output = list.last();
		assertEquals(3,output);
	}
	
	/*
	 * This method will try to append to an empty list
	 */
	@Test
	void testAppendToEmptyList() {
		SimpleList list = new SimpleList();
		list.append(5);
		String output = list.toString();
		assertEquals("5",output);
	}
	
	/*
	 * This method will try to append multiple numbers to a list
	 */
	@Test
	void testAppendToList() {
		SimpleList list = new SimpleList();
		list.add(2);
		list.add(7);
		list.append(5);
		list.append(4);
		list.append(3);
		list.append(5);
		list.append(4);
		list.append(3);
		list.append(5);
		list.append(4);
		list.append(3);
		String output = list.toString();
		assertEquals("7 2 5 4 3 5 4 3 5 4 3",output);
	}
	
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
		assertEquals("4 3 2",output);
	}
	
	/*
	 * This method will try removing a number that doesn't
	 * exist
	 */
	@Test
	void testRemovingNonExistentNumber() {
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
	void testSearchingNonExistentNumber() {
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

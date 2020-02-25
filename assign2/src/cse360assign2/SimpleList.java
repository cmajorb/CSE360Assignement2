/**
 * @author Clinton Brown
 * Class ID: 134
 * Assignment 1
 * 
 * This project creates a SimpleList class that has an array that
 * can hold 10 items and includes several functions to add new 
 * items, remove them, search, count, and print out the array.
 */

package cse360assign2;

/**
 * This class contains the objects and methods to create a list
 * of 10 numbers. Values can be added or removed, and there are
 * other helpful functions including searching for a value and
 * getting the count of numbers in the list.
 *
 */
public class SimpleList {
	/**
	 * listSize is set to 10 since that is the size of the list
	 * list is the array of numbers that will be kept
	 * count contains the size of the list, which is initially 0
	 */
	int listSize = 10;
	int list[] = new int[listSize];
	int count = 0;
	
	/**
	 * This method adds a new number to the beginning of the array,
	 * moving all other numbers to the right. If the array is full,
	 * the last number is dropped off of the list. The count variable
	 * is incremented each time.
	 * 
	 * @param addNumber the number to be added to the beginning
	 * of the list
	 */
	public void add(int addNumber) {
		if(count==listSize) {
			listSize = (int)((float)listSize * 1.5);
			int tempArray[] = new int[listSize];
			for(int index = 1; index<=count; index++) {
				tempArray[index] = list[index-1];
			}
			tempArray[0] = addNumber;
			list = tempArray;
		}
		else {
			for(int index = listSize-1; index > 0; index--) {
				list[index] = list[index-1];
			}
			list[0] = addNumber;
		}
		
		count++;
	}
	/**
	 * This method searches for a given number and removes all
	 * occurrences of that number in the list. The rest of the
	 * numbers shift accordingly and the count variable is updated.
	 * 
	 * @param removeNumber the number to be removed from the list
	 */
	public void remove(int removeNumber) {
		int position = search(removeNumber);
		while(position != -1) {
			for(int index = position; index < listSize-1; index++) {
				list[index] = list[index+1];
			}
			list[listSize-1] = 0;
			count--;
			position = search(removeNumber);
		}
		if(count/listSize < 0.75) {
			if(count < 1) {
				listSize = 1;
			}
			else {
				listSize = (listSize * 3) / 4;
			}
			int tempArray[] = new int[listSize];
			for(int index = 0; index<count; index++) {
				tempArray[index] = list[index];
			}
			list = tempArray;
		}
	}
	/**
	 * This method searches for a given number within the list and
	 * returns its location.
	 * 
	 * @param searchNumber the number to search for
	 * @return the location of the number searched for. If it is
	 * not found, then -1 is returned.
	 */
	public int search(int searchNumber) {
		int searchLocation = -1;
		int index = 0;
		while(searchLocation == -1 && index < listSize) {
			if(list[index] == searchNumber) {
				searchLocation = index;
			}
			index++;
		}
		return searchLocation;
	}
	/**
	 * This method returns the size of the list.
	 * 
	 * @return the count variable (size of the list)
	 */
	public int count() {
		return count;
	}
	
	/**
	 * This method prints out the list of numbers separated by spaces
	 * 
	 * @return a string output of the list
	 */
	public String toString() {
		String result = "";
		if(count>0) {
			result = String.valueOf(list[0]);
		}
		for(int index = 1; index < count; index++) {
			result = result + " " + list[index];
		}
		return result;
	}
	
	public void append(int appendNumber) {
		if(count==listSize) {
			listSize = listSize + (listSize/2);
			int tempArray[] = new int[listSize];
			for(int index = 0; index<count; index++) {
				tempArray[index] = list[index];
			}
			tempArray[count] = appendNumber;
			list = tempArray;
		}
		else {
			list[count] = appendNumber;
		}
		
		count++;
	}
	public int first() {
		return list[0];
	}
	public int size() {
		return listSize;
	}
	
}

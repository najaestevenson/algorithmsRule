package algorithms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import algorithms.BubbleSort;

public class sortAlgorithms {
BubbleSort bs;
int [] array;

@Before
public void setUp(){
	bs = new BubbleSort();
	
}
	@Test
	public void bubbleSorttest() {
		//Using J-unit I can do test driven development. 
		//I write the code i want to test. I know my code will error out at first.
		 array = new int[]{2,55,23,11,9,43,33,17};
		bs.unsortedArray(array);
		int [] actual = bs.bubbleSort(array);
		int [] expected = {2,9,11,17,23,33,43,55};
		bs.printSortedArray(array);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void anotherBubbleSortTest(){
	array = new int[]{9,5,8,6,3,7,2,1};
	bs.unsortedArray(array);//printing unsorted array
	int[] actual= bs.bubbleSort(array);// calling bubble sort on array 
	int[] expect = {1,2,3,5,6,7,8,9};
	bs.printSortedArray(array);
	assertArrayEquals(expect, actual);
	}

}


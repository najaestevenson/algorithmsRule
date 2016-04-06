package algorithms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import algorithms.BubbleSort;

public class sortAlgorithms {
BubbleSort bs;
QuickSort qs;
int [] array;

@Before
public void setUp(){
	bs = new BubbleSort();
	qs = new QuickSort();
	
}
	@Test
	public void bubbleSorttest() {
		//Using J-unit I can do test driven development. 
		//I write the code i want to test. I know my code will error out at first.
		 array = new int[]{2,55,23,11,9,43,33,17};
		bs.unsortedArray(array);//print unsorted array
		int [] actual = bs.bubbleSort(array);//call sort method
		int [] expected = {2,9,11,17,23,33,43,55};
		bs.printSortedArray(array);// print sorted array
		assertArrayEquals(expected, actual);
	}
	@Test
	public void anotherBubbleSortTest(){
	array = new int[]{9,5,8,6,3,7,2,1};
	bs.unsortedArray(array);//printing unsorted array
	int[] actual= bs.bubbleSort(array);// calling bubble sort on array 
	int[] expect = {1,2,3,5,6,7,8,9};
	bs.printSortedArray(array);//print sorted array
	assertArrayEquals(expect, actual);
	}

	@Test
	public void quickSortTest(){
		array = new int[]{29,45,77,84,1,93,25,82};
		qs.printUnsortedArray(array);
		int [] actual = qs.sort(array);
		int [] expected = {1,25,29,45,77,82,84,93};
		qs.printsortedArray(array);
		assertArrayEquals(expected, actual);
	}
}


package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.BubbleSort;

public class sortAlgorithms {

	@Test
	public void bubbleSorttest() {
		//Using J-unit I can do test driven development. 
		//I write the code i want to test. I know my code will error out at first.
		BubbleSort bs = new BubbleSort();// no class called BubbleSort in package
		int [] array = new int[]{2,55,23,11,9,43,33,17};
		bs.unsortedArray(array);
		int [] actual = bs.bubbleSort(array);
		int [] expected = {2,9,11,17,23,33,43,55};
		bs.printSortedArray(array);
		assertArrayEquals(expected, actual);
	}

}


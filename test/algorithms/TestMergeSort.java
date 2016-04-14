package algorithms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMergeSort {
	MergeSort ms;
	int[] array;
@Before
public void setup(){
	ms = new MergeSort();
	
}
	@Test
	public void MergeSortTest() {
		array = new int[]{37,49,2,74,6,83,0,9,4,9,87,8,28};
		
		int[] actual = ms.sort(array);
		int[] expected ={0,2,4,6,8,9,9,28,37,49,74,83,87};
		assertArrayEquals(expected, actual);
		
	}

}

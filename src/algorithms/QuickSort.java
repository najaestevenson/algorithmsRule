package algorithms;

class QuickSort {

	private int arr[];
	private int length;

	public void printUnsortedArray(int[] array) {
		System.out.println("Array before Quick Sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public int[] sort(int[] inputArr) {
		if (inputArr == null || inputArr.length == 0) {
			return null;
		}
		this.arr = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
		return inputArr;
		
	}

	public void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = arr[lowerIndex + (higherIndex - lowerIndex) / 2];
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		if (lowerIndex < j) {
			quickSort(lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}

	}

	public void exchangeNumbers(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void printsortedArray(int[] array) {
		this.sort(array);
		System.out.println("After quickSort");
		for (int i : array) {
			System.out.print( i+" ");
			
			
		}
		}
}
	



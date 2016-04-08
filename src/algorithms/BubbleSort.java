package algorithms;

class BubbleSort {

	public void unsortedArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array before bubble sort" + a[i] + "");
		}
	}

	public int[] bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}

		}
		return array;
	}

	public void printSortedArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array after bubble sort" + a[i] + "");
		}

	}
}

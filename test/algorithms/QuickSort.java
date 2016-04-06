package algorithms;

class QuickSort {
	
private int arr[];
private int length;
	public void printUnsortedArray(int[] array) {
		for(int i = 0; i< array.length; i++){
			System.out.println("Array before bubble sort"+ array[i]+"");
		}
		
	}
	public int[] sort( int[] inputArr){
		if(inputArr== null|| inputArr.length ==0){
			return null;
		}
		this.arr = inputArr;
		length = inputArr.length;
		return quickSort(0, length-1);
		}

	
	public int[] quickSort(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public void printsortedArray(int[] array) {
		for(int i = 0; i< array.length; i++){
			System.out.println("Array after bubble sort"+ array[i]+"");	
	}
		
	}

}

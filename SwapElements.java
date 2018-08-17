package stringsplittertester;

public class SwapElements {
	
	
	public static void main(String args[]) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10,11};
		array = swapElements(array);
		
		for(int i=0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}

	private static int[] swapElements(int[] array) {
		
		//first Interchange 5th and 11th Element
		array = interchangeElement(5,11,array);
		
		//shift elements from 6th to 1oth on right side by 1
		array = shiftElements(array,6,10);
		
		return array;
	}

	private static int[] shiftElements(int[] array, int index1, int index2) {
		
		
		
		for(int i= index2-1; i >= (index1-1)  ; i--) {
                array[i+1] = array[i];			
			
		}
		
		return array;
		
	}

	private static int[] interchangeElement(int index1, int index2, int[] arr) {
		
		int temp = arr[index1-1];
		arr[index1-1] = arr[index2-1];
		arr[index2-1] = temp;
		
		return arr;
	}
	

}

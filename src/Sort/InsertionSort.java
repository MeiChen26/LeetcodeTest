package Sort;

public class InsertionSort {
    public void insertionSort(int[] array) {
    	int count = 0;
    	for(int i = 1; i < array.length; i++) {
    		int j;
    		int temp = array[i];
    		for(j = i - 1; j >= 0; j--) {
    			count++;
    			if(temp < array[j])
    				array[j + 1] = array[j];
    		}
    		array[j + 1] = temp;
    	}
    	System.out.println("比较的次数：" + count);
    }
    public static void main(String[] args) {
    	InsertionSort test = new InsertionSort();
    	int[] array = {8,7,6,5,4,3,2,1};
    	test.insertionSort(array);
    	for(int a: array) {
    		System.out.println(a);
    	}
    }
}

package Sort;

public class SelectionSort {
    public void selectionSort(int[] array) {
    	int count = 0;
    	int count2 = 0;
    	for(int i = 0; i < array.length - 1; i++) {
    		int min = i;
    		for(int j = i + 1; j < array.length; j++) {
    			count++;
    			if(array[j] < array[min]) {
    				min = j;
    			}
    		}
    		if(min != i) {
    			count2 += 3;
    			int temp = array[i];
    			array[i] = array[min];
    			array[min] = temp;
    		}
    	 }
    	System.out.println("比较的次数：" + count);
    	System.out.println("移动的次数：" + count2);
    }
    
    public static void main(String[] args) {
    	SelectionSort test = new SelectionSort();
    	int[] array = {8,7,6,5,4,3,2,1};
    	test.selectionSort(array);
    	for(int a: array) {
    		System.out.println(a);
    	}
    }
}

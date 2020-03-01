package Search;

public class BinarySearchTest {
    public int binarySearch(int[] array, int key) {
    	int low = 0;
    	int high = array.length - 1;
    	while(low <= high) {
    		int mid = low + (high - low) / 2;
    		if(array[mid] == key)
    			return mid;
    		else if(key < array[mid])
    			high = mid + 1;
    		else if(key > array[mid])
    			low = mid + 1;
    	}
    	return -1;
    }
    public static void main(String[] args) {
		BinarySearchTest test = new BinarySearchTest();
		int n = 100;
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = i;
		}
		System.out.println("要查找数的位置为：" + test.binarySearch(array, 6));
	}
}

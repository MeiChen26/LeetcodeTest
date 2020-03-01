package Search;

import java.util.HashMap;

//456789123    45123
public class RotateArraySearch {
    public int rotateSearch(int[] array, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
    	int left = 0;
    	int right = array.length - 1;
    	while(left <= right) {
    		int mid = left + (right - left) / 2;
    		if(array[mid] == k)
    			return mid;
    		//如果数组左半边是递增的
    		if(array[mid] > array[left]) {
    			//在递增的范围内
    			if(k <= array[mid] && k >= array[left]) {
    				right = mid - 1;
    			}else
    			    left = mid + 1; //不在递增的范围
    		}
    		//数组右半边是递增的
    		else {
    			if(k >= array[mid] && k <= array[right]) {
    				left = mid + 1;
    			}
    			else right = mid - 1;
    		} 			
    	}
    	return -1;
    }
    
    public static void main(String[] args) {
    	int[] array = new int[] {4,5,6,7,1,2,3};
		RotateArraySearch test = new RotateArraySearch();
		System.out.println("查找的数的位置为：" + 
		                   test.rotateSearch(array, 6));		
	}
}

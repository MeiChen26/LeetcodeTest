package Sort;

public class BubbleSort {
	public void bubbleSort(int[] array) {
		int count = 0;
		int count2 = 0;
		boolean flag = true;
		for(int i = 1; i < array.length && flag; i++) {
			flag = false;
			for(int j = 0; j < array.length - i; j++) {
				count++;
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true;
					count2 = 3 * count;
				}
			}
		}
		System.out.println("比较的次数：" + count);
		System.out.println("移动的次数: " + count2);
	}
    
	public static void main(String[] args) {
		BubbleSort test = new BubbleSort();
		int[] array = {1,2,3,4,5,6,7,8};
		test.bubbleSort(array);
		for(int a: array) {
			System.out.println(a);
		}
	}
    
}

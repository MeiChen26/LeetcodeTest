package PriorityQueueTest;

import java.util.PriorityQueue;

public class PQ {
    public int findKMax(int[] array, int k) {
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	for(int a: array) {
    		pq.offer(a);
    	}
    	for(int i = pq.size(); i > k; i--) {
    		pq.poll();
    	}
    	return pq.poll();
    }
    public static void main(String[] args) {
    	
            int n = 15;
            n |= n >>> 1;
            n |= n >>> 2;
            n |= n >>> 4;
            n |= n >>> 8;
            n |= n >>> 16;
            System.out.println("threshold:" + n);

	PQ test = new PQ();
	int[] array = {44, 3, 11, 33, 2};
	System.out.println("数组中第k个最大的值是：");
	System.out.println(test.findKMax(array, 2));
    }
}

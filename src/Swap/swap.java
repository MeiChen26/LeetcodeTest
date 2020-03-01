package Swap;

import java.util.LinkedList;
import java.util.List;

public class swap {
	    static int x = 4;
		static int y = 3;
	public static void main(String[] args) {
		swap test = new swap();										
		List<Integer> l1 = new LinkedList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(1);
		l2.add(2);
		l2.add(2);
		test.swap(l1, l2);
		for(Integer a: l1)
		    System.out.println(a);	
	}
	
	public void swap(List l1, List l2) {
		List<Integer> temp = new LinkedList<Integer>();
		temp.addAll(l1);
		l1.removeAll(l1);
		l1.addAll(l2);
		l2.addAll(l1);

	}
	
}

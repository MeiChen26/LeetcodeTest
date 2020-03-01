package DFSTest;

import java.util.LinkedList;
import java.util.List;

public class CombinationTest {
	    List<List<Integer>> results = new LinkedList<List<Integer>>();
	    public List<List<Integer>> combine(int n, int k) {       
	       
	    	List<Integer> list = new LinkedList<Integer>();
	    	helper(n, k, list, 1, 0);
	        return results;
	    }
	    
	    public void helper(int n, int k,  List<Integer> list, int m, int d){
	        if(d == k){
	            results.add(new LinkedList<Integer>(list));
	            System.out.println("打印结果");
	            for(int i = 0; i < results.size(); i ++) {
					List<Integer> answer = results.get(i);
					for(int j = 0; j < answer.size(); j++) {
						System.out.print(answer.get(j) + " ");
					}
		            System.out.println();
				}
	            return;
	        }        	        
	        for(int i = m; i <= n; i++){   
	        	list.add(i);
	        	System.out.println("shuchu:");
	            for(Integer a: list) {
	                System.out.print(a + " ");
	            }
	            System.out.println(" ");
	            helper(n, k, list, i + 1, d + 1);    	           
	            list.remove(list.size() - 1);  
	            System.out.println("回溯：");
	            for(Integer a: list)
	                System.out.println(a + " ");
	        }

	    }
	    public static void main(String[] args) {
			CombinationTest test = new CombinationTest();
			List<List<Integer>> results = test.combine(4, 2);
			System.out.print("结果：");
			for(int i = 0; i < results.size(); i ++) {
				List<Integer> answer = results.get(i);
				for(int j = 0; j < answer.size(); j++) {
					System.out.println(answer.get(j));
				}
			}
		}
	
}

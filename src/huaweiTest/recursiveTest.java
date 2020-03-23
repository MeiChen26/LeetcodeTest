package huaweiTest;

import java.util.ArrayList;
import java.util.List;

public class recursiveTest { 
	 public static List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> results = new ArrayList<List<Integer>>();
	        List<Integer> list = new ArrayList<Integer>();
	        int[] visited = new int[nums.length];

	        helper(nums, results, list, 0, visited);
	        results.stream().forEach(System.out::println);
	        return results;
	    }
	    //n是递归深度，visited是访问记录数组，如果访问过就置1.
	    public static void helper(int[] nums, List<List<Integer>> results,  List<Integer> list, int n, int[] visited){
	        if(n == nums.length){
	            results.add(new ArrayList<Integer>(list));
	            return;
	        }
	      
	        for(int i = 0; i < nums.length; i++){
	          if(visited[i] == 1) continue;
	                visited[i] = 1;
	                list.add(nums[i]);          
	                helper(nums, results, list, n + 1, visited);  
	            
	                
	                list.remove(list.size() - 1); 
	                visited[i] = 0;
	            
	        }
	    }

      public static void main(String[] args) {
    	  int[] nums = new int[] {1,2,3};
      
    	 permute(nums);
	}
     
}

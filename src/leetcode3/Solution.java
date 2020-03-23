package leetcode3;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
	 public int lengthOfLongestSubstring(String s) {
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	        int left = 0;
	        int max = 0;
	        for(int right = 0; right < s.length(); right++){
	            char c = s.charAt(right);
	            if(map.containsKey(c)){
	               left = Math.max(map.get(c) + 1, left);
	            }
	        
	             max = Math.max(max, right - left + 1);
	             map.put(c, right);
	        }
	        return max;
	       
	    }
    public static void main(String[] args) {
		Solution test = new Solution();
		System.out.println(test.lengthOfLongestSubstring("    "));
		
	}
}
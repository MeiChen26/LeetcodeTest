package BFSTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.offer(root);
        while(!q.isEmpty()){
        	int size = q.size();
        	ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
            	
                TreeNode node = q.poll();
                if(node == null)
                    list.add(0);
                else{
                    list.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
                
            }
            if(!isPalindrome(list))
                return false;
        }
        return true;
    }
    
    public boolean isPalindrome(ArrayList<Integer> list){
    	for(Integer a: list) {
    	    System.out.print(a + " ");
    	}
    	System.out.println();
        int l = 0;
        int r = list.size() - 1;
        while(l <= r){
            if(list.get(l) != list.get(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
    	SymmetricTree test = new SymmetricTree();
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(3);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		if(test.isSymmetric(node1))
			System.out.println("是");
		else 
			System.out.println("否");
		
	}
}
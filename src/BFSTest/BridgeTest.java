package BFSTest;

import java.util.LinkedList;
import java.util.Queue;

class BridgeTest {
    Queue<int[]> q = new LinkedList<int[]>();
    public int shortestBridge(int[][] A) {
        int[] direc = {1, 0, -1, 0, 1};
        boolean found = false;
        System.out.println("zhixing1");
      for(int i = 0; i < A.length; i++){
          if(found == true)
              break;
          for(int j = 0; j <A[0].length; j++){
              if(A[i][j] == 1){
                  helper(A, i, j);
                  found = true;
                  break;          
              }
          }
      }
        int length = 0;
        while(!q.isEmpty()){
        	System.out.println("zhixing");
            int size = q.size();
            length++;
            for(int i = 0; i < size; i++){
                int[] d = q.poll();
                for(int j = 0; j < 4; j++){
                    int rowNext = d[0] + direc[j];
                    int colNext = d[1] + direc[j + 1];
                    if(rowNext >= 0 && rowNext < A.length && colNext >= 0 && colNext < A[0].length){           if(A[rowNext][colNext] == 1)
                            return length -1;          
                       q.offer(new int[]{rowNext, colNext});
                       A[rowNext][colNext] = 2;                                                                                   
                    }
                }
                
            }
        }
        return -1;
    }
        
       
    public void helper(int[][] A, int i, int j){
        if(i >= 0 && i < A.length && j >= 0 && j < A[0].length && A[i][j] == 1){         
            A[i][j] = 2;
            q.offer(new int[]{i, j});
            helper(A, i, j + 1);
            helper(A, i, j - 1);
            helper(A, i + 1, j);
            helper(A, i - 1, j);
            
        }
    }
    
    public static void main(String[] args) {
		BridgeTest test = new BridgeTest();
		int[][]A=new int[][] {
			{0,1}, {1, 0}
		};
		System.out.println(test.shortestBridge(A));
	}
} 
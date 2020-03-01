package DFSTest;

public class WordSearchTest {
	 public int[][] direc = new int[][]{
         {1,0},{0,1},{-1,0},{0,-1}
     };
 
 public boolean exist(char[][] board, String word) {
     int[][] visited = new int[board.length][board[0].length];
     StringBuffer buffer = new StringBuffer();
     for(int i = 0; i < board.length; i++){
         for(int j = 0; j < board[0].length; j++){
             visited[i][j] = 0;
         }
     }
     for(int i = 0; i < board.length; i++){
         for(int j = 0; j < board[0].length; j++){
        	 System.out.println("i:" + i + " j:" + j);
             if(DFS(board, word, i, j, visited, buffer))
                 return true;
         }
     }
     return false;
 }
 
 public boolean DFS(char[][] board, String word, 
                    int row, int col, int[][] visited, StringBuffer buffer){
     buffer.append(board[row][col]);
     System.out.println(buffer.toString());
     System.out.println("visited:");
     for(int i = 0; i < visited.length; i++) {
    	 for(int j = 0; j < visited[0].length; j++)
    		 System.out.print(visited[i][j]);
    	 System.out.println();
     }
     if(buffer.toString().equals(word))
         return true;
     for(int i = 0; i < direc.length; i++){      
             int nextRow = row + direc[i][0];
             int nextCol = col + direc[i][1];  
             visited[row][col] = 1;
             System.out.println("next:" + nextRow + "" + nextCol);
             if(nextRow  >= 0 && nextRow < board.length && nextCol >= 0 && nextCol < board[0].length){   
                 if(visited[nextRow][nextCol] == 1)
                     continue;       
                 if(DFS(board, word, nextRow, nextCol, visited, buffer))
                     return true;                     
             }
         }   
     visited[row][col] = 0;     
     buffer.deleteCharAt(buffer.length() - 1);
     return false;
     }     
     public static void main(String[] args) {
		WordSearchTest test = new WordSearchTest();
		char[][] board = new char[][] {
			{'a', 'b'}
		};
		String str = new String("ba");
		if(test.exist(board, str))
			System.out.println("存在");;
		
	}
}

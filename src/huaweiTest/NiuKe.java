package huaweiTest;

import java.util.HashMap;
import java.util.Scanner;

public class NiuKe {
	 

	 public static void main(String[] args) {
         int[][] board = new int[9][9];
		 Scanner sc = new Scanner(System.in);
		  while(sc.hasNextInt()){
	            for(int i = 0; i < 9; i++){
	                for(int j = 0; j < 9; j++){
	                    board[i][j] = sc.nextInt();
	                }
	            } 
	           
	        }
		  for(int i = 0; i < 9; i++){
              for(int j = 0; j < 9; j++){
                 if(j!=8)
                    System.out.print(board[i][j]+" ");
                else
                    System.out.println(board[i][j]);
        }
    }

	}
}

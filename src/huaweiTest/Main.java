package huaweiTest;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        while(sc.hasNext()){
	        	
	                String str = sc.next();
	                String str1 = str.substring(1,2);
	                
	                System.out.println(str1);
	        }
	    }
}

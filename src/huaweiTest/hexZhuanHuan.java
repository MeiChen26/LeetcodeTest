package huaweiTest;

import java.util.Scanner;

public class hexZhuanHuan {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String input = "";
	        while((input = sc.nextLine()) != null){
	        int bit = 0;
	        int result = 0;
	        for(int i = input.length() - 1; i > 1; i--){
	            char c = input.charAt(i);
	            if(c >= '0' && c <= '9'){
	                result += (c - '0') * Math.pow(16, bit++);
	            }
	            else if(c >='A' && c <= 'F'){
	                result += (c - 'A' + 10) * Math.pow(16, bit++);
	            }
	        }
	        System.out.println(result);
	        }
	    }
}

package huaweiTest;

import java.util.*;
public class findPrime{
    public static void main(String[] args){
        StringBuffer ret = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean flag = true;
        for(int i = 2; i < 180; i++){
            if(n % i == 0){
                for(int j = 2; j < i; j++){
                    if(i == j)
                       continue;
                    if(i % j == 0){
                        flag = false;
                    }
                }
                if(flag == true){
                    ret.append(String.valueOf(i));
                    ret.append(" ");
                }
                n = n / i;
            }
        }
        String str = ret.toString();
        if(str.length() == 0)
            System.out.println("prime111: " + String.valueOf(n));
        else
            System.out.println("prime: " + str);
    }
}
package BFSTest;

public class OneBit {
    public static void main(String[] args) {
    	int oneNum = 9;
    	int count = 0;
        if((oneNum & 1) == 1){
            count++;
        }
        System.out.println(count);
	}
}

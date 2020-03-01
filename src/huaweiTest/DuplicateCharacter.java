package huaweiTest;

public class DuplicateCharacter {
    public static void duplicateChar(String input) {
    	int[] count = new int[127];
    	for(char c: input.toCharArray()) {
    		count[(int)c]++;
    	}
    	for(int i = 0; i < 127; i++) {
    		if(count[i] >= 1)
    			System.out.println((char) i);
    	}
    }
    public static void main(String[] args) {
		String input = "ABCABCdd";
		duplicateChar(input);
		
	}
}

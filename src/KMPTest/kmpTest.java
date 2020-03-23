package KMPTest;

public class kmpTest {
    public static void main(String[] args) {
		kmpTest test = new kmpTest();
		String s ="dabcabdabcabc";
		String t ="bcabdabcabc";
		int[] next = new int[t.length() + 1];
		test.getNext(t, next);
		System.out.println(test.isPattern(s, t, next));
		
	}
    public int isPattern(String s, String t, int[] next) {
    	int i = 0, j = 0;
    	while(i < s.length() && j < t.length()) {
    		if(j == -1 || s.charAt(i) == t.charAt(j)) {
    			i++;
    			j++;
    		}
    		else {
    			j = next[j];
    		}	
    	}
    	if(j == t.length())
    		return i - j;
    	else return -1;
    	
    }
    public void getNext(String t, int[] next) {
    	int k = 0;
    	int j = 1;
    	next[0] = -1;
    	next[1] = 0;
    	while(j < t.length()) {
    		if(t.charAt(k) ==t.charAt(j)) {
    			next[j + 1] = k + 1;
    			j++;
    			k++;
    		}else if(k == 0) {
    			next[j + 1] = 0;
    			j++;
    		}else {
    			k = next[k];
    		}
    	}
    }
}

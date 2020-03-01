package StringPermutation;

public class StringPermutationTest {
    public void printAll(String s) {
    	if(s == null || s.length() == 0)
    		return;
    
    StringBuffer sb = new StringBuffer();
    dfs(s, sb, 0);
 }
    public void dfs(String s, StringBuffer sb, int d) {
    	if(d == s.length() - 1) {
    		sb.append(s.charAt(d));
    		System.out.println(sb.toString());
    		sb.deleteCharAt(sb.length() - 1);
    		return;
    	}  
    		sb.append(s.charAt(d));
    		sb.append(" ");
    		dfs(s, sb, d + 1);
    		sb.deleteCharAt(sb.length() - 1);
    		dfs(s, sb, d + 1);
    		sb.deleteCharAt(sb.length() - 1);
    	
    }
    
    public static void main(String[] args) {
    	StringPermutationTest test = new StringPermutationTest();
    	test.printAll("abcd");
    }
}

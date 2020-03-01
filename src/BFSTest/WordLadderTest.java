package BFSTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class WordLadderTest {
	 public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	        if(!wordList.contains(endWord))
	            return 0;
	        int length = 1;
	        char[] alphabet ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n'
	                          ,'o','p','q','r','s','t','u','v','w','x','y','z'};
	        Queue<String> q = new LinkedList<String>();
	        q.offer(beginWord);
	        while(!q.isEmpty()){
	            length++;
	            int size = q.size();
	            for(int i = 0; i < size; i++){
	                String str = q.poll();                
	                for(int j = 0; j < str.length(); j++){
	                    char[] chars = str.toCharArray();
	                    for(int x = 0; x < 26; x++){
	                        chars[j] = alphabet[x];
	                        String newString = String.valueOf(chars);
	                        System.out.println(newString);
	                        if(newString.equals(endWord))
	                            return length;
	                        if(wordList.contains(newString)){                        
	                            q.offer(newString);
	                            wordList.remove(wordList.indexOf(newString));
	                            for(String s:wordList)
	                            	System.out.println("list" + s);
	                            System.out.println("length" + length);
	                         
	                        }
	                    }
	                }
	            }
	        }
	        return -1;
	                            
	    }
    
    public static void main(String[] args) {
    	ArrayList<String>wordList = new ArrayList<String>();
    	wordList.add("dot");
    	wordList.add("dog");
    	wordList.add("lot");
    	wordList.add("log");
    	wordList.add("cog"); 
    	wordList.add("hot");
    	String startWord = "hit";
    	String endWord = "cog";
    	WordLadderTest test = new WordLadderTest();
    	System.out.println("需要：" + test.ladderLength(startWord, endWord, wordList));
    }
                          
                           
}
package BFSTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class WordLadderTest2 {
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList.indexOf(endWord) == -1)
            return 0;
        int length = 0;
        HashSet<String> set = new HashSet<String>();
        for(String s: wordList){
            set.add(s);
        }
        Queue<String> qStart = new LinkedList<String>(); 
        Queue<String> qEnd = new LinkedList<String>();

        qStart.offer(beginWord);      
        qEnd.offer(endWord);
        while(!qStart.isEmpty() || !qEnd.isEmpty()){
        	System.out.println("startq");
        	for(String x: qStart)
        		System.out.println(x);
        	System.out.println("endq");
        	for(String x: qEnd)
        		System.out.println(x);
            length++;
          int size = qStart.size();
            for(int i = 0; i < size; i++){
                String str = qStart.poll();                
                for(int j = 0; j < str.length(); j++){
                    char[] chars = str.toCharArray();
                    for(char c = 'a'; c < 'z'; c++){
                        chars[j] = c;
                        String newString = String.valueOf(chars);
                        if(qEnd.contains(newString))
                            return length + 1;
                        if(set.contains(newString)){ 
                        	
                            qStart.offer(newString);
                            set.remove(newString); 
                            System.out.println("set");
                            for(String x:set)
                        		System.out.println(x);     
                           
                                             
                        }
                    }
                }             
        }       
            
            Queue<String> temp = new LinkedList<String>();
            temp = qStart;
            qStart = qEnd;
            qEnd = temp;
        System.out.println("-------startq");
        for(String x: qStart)
    		System.out.println(x);
    	System.out.println("-------endq");
    	for(String x: qEnd)
    		System.out.println(x);
        
        if(qStart.isEmpty())
        System.out.println("start1");
        if(qEnd.isEmpty())
            System.out.println("end1");
    }
  return 0;       
                                                    
}

    
    public static void main(String[] args) {
		WordLadderTest2 test = new WordLadderTest2();
		String start = "hot";
		String end = "dog";
		ArrayList<String> list = new ArrayList<String>();
		list.add("hot");
		list.add("dog");
		System.out.println("长度：" + test.ladderLength(start, end, list));
	}
}
package MultiThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class HashMapDemo {
	public static void main(String[] args) {
//	    List<String> list = new ArrayList<>();
//	    List<String> list1 = new Vector<>();
//	    list1.add("a");
//	    list1.add("a");
//	    list1.forEach(System.out::println);
//        for(int i = 1; i <=10; i++) {
//    	    new Thread (() -> {
//    		list.add(UUID.randomUUID().toString().substring(0, 8));
//    	    System.out.println(list);
//    	    }, String.valueOf(i)).start();
//    	    
//        }
		
		HashMap<Character, Integer>map = new HashMap<>();
		map.put('a', 1);
		map.put('a', 2);
		System.out.println(map.get('a'));
		HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();
		ArrayList<Integer> array = new ArrayList<>();
   }
}


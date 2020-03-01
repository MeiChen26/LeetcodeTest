package CourseSchedule;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;

class CourseScheduleII {
    public boolean canFinish(int numCourses, String[][] prerequisites) {
        HashMap<String, Integer> indegree = new HashMap<>();
        for(String[] cp : prerequisites) {
        	indegree.put(cp[0], indegree.getOrDefault(cp[0], 0) + 1);
        	if(!indegree.containsKey(cp[1])) {
        		indegree.put(cp[1], 0);
        	}
        }
        Queue<String> queue = new LinkedList<>();
        for(Entry<String, Integer> en: indegree.entrySet()) {
        	if(en.getValue() == 0) {
                queue.offer(en.getKey());
        	}
        }
        
        System.out.println("选修顺序可以为：");
        while(!queue.isEmpty()) {
            String pre = queue.poll();
            System.out.println(pre);
            numCourses--;
            for(String[] req : prerequisites) {
                if(req[1] != pre) continue;
                int k = indegree.get(req[0]) - 1;
                indegree.put(req[0], k);
                if(k == 0) {
                	queue.offer(req[0]);
                }
            }
        }
        return numCourses == 0;
    }
    public static void main(String[] args) {
		CourseScheduleII test = new CourseScheduleII();
		String[][] pre = new String[][] {
			{"Java语言", "计算机基础"},
			{"c语言", "计算机基础"},
			{"Java语言", "c语言"},
			{"Java Web开发", "Java语言"}
		};
		test.canFinish(4, pre);
	}
    
}


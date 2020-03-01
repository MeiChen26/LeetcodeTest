package CourseSchedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleTest {
	public static void main(String[] args) {
		CourseScheduleTest test = new CourseScheduleTest();
		int numCourses = 3;
		int[][] prerequisites = {
				{1,0},{2,0}
		};
		if(test.canFinish(numCourses, prerequisites))
			System.out.println("true");
		else
			System.out.println("false");
	}
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0)
            return true;
        int[] indegree = new int[prerequisites.length + 1];
        Arrays.fill(indegree, -1);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int count = 0;
        for(int[] p: prerequisites){
            if(!map.containsKey(p[0])){
                indegree[p[0]] = 0;
                map.put(p[0], new ArrayList<Integer>());
                count++;
            }
            if(!map.containsKey(p[1])){
                indegree[p[1]] = 1;
                map.put(p[1], new ArrayList<Integer>());
                count++;
            }
            else{
                indegree[p[1]]++;
            }
            map.get(p[0]).add(p[1]);
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
            System.out.println(indegree[i]);
        }

        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.println(temp);
            count--;
            if(map.get(temp) != null){
                for(int a: map.get(temp)){
                    if(--indegree[a] == 0){
                        q.offer(a);
                    }
                }
            }
           
        }
        System.out.println(count);
        return count == 0;
    }
}

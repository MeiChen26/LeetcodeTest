package MultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

/*
 * 1. 故障现象
 * 2. 导致原因
 * 3. 解决方法
 * 4. 优化建议
 */
public class NotSafeDemo {
	public static void main(String[] args) {
        List<String> list = new Vector<>();
        for(int i = 1; i <=30; i++) {
        	new Thread (() -> {
        		list.add(UUID.randomUUID().toString().substring(0, 8));
        		System.out.println(list);
        	}, String.valueOf(i)).start();
        }
	}
}

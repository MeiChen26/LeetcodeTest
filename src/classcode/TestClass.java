package classcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
		long maxMemory = Runtime.getRuntime().maxMemory();
		System.out.println(maxMemory/1024/1024);
		long totalMemory = Runtime.getRuntime().totalMemory();
		System.out.println(totalMemory/1024/1024
				);
		
		
	}
}

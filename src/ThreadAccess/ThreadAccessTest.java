package ThreadAccess;

public class ThreadAccessTest {
	public static void main(String[] args) {
		SharedResource shareResource = new SharedResource();
		
		new Thread(()->{
			
			shareResource.print5();
	
        },"A").start();
		
		new Thread(()->{
			
				shareResource.print10();
		
        },"B").start();
		
		new Thread(()->{
			
			shareResource.print15();
	
        },"C").start();
		
	}
}

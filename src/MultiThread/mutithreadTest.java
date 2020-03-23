package MultiThread;
class synchronizeclass{
	public synchronized void print() {
		for(int i = 0; i < 100;i++)
			System.out.println(Thread.currentThread().getName() +"t1");
	}
}
public class mutithreadTest {
	public static void main(String[] args) {
		synchronizeclass test = new synchronizeclass();
		
		new Thread(
				()->{
					test.print();	
				}
			, "B").start();
		
		new Thread(
			()->{
				test.print();
			}
		,"A").start();
		
		new Thread(
				()->{
					System.out.println(Thread.currentThread().getName() +"x1");
					
					System.out.println(Thread.currentThread().getName() +"x2");
				}
			,"C").start();
	}
}

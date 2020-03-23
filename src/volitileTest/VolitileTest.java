package volitileTest;
class MyNumber{
	public volatile int num = 10;
	public void addTo1205() {
		num = 1205;
	}
	
}
public class VolitileTest {
	public static void main(String[] args) {
		MyNumber myNumber = new MyNumber();
		new Thread(() -> {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			myNumber.addTo1205();
			System.out.println(Thread.currentThread().getName() +myNumber.num);
		}).start();
		
		while(myNumber.num == 10) {

	    }
		System.out.println("missiopn ok");
	}
}

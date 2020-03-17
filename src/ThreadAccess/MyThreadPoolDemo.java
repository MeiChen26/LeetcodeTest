package ThreadAccess;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class MyThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		Callable<Date> task = new Callable<Date>() {
			public Date call() throws Exception{
				return sdf.parse("20151217");
			}
		};
//		try {
//			for(int i = 1; i <=10; i++) {
//				threadPool.execute(()->{
//					System.out.println(Thread.currentThread().getName());
//				});
//				TimeUnit.SECONDS.sleep(1);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			threadPool.shutdown();
//		}
		List<Future<Date>> results = new ArrayList<>();
//		for(int i = 1; i < 5; i++) {
//			results.add(threadPool.submit(task));
//		}
//		for(Future<Date> future: results) {
//			System.out.println(future.get());
//		}
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}

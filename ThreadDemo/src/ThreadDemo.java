/**
 * 创建启动线程
 * 创建Thread子类对象
 * 子类对象调用方法start()
 * JVM调用线程中的run
 * @author Flj
 *	
 *
 */
public class ThreadDemo{
	public static void main(String[] args) throws InterruptedException {
		/*
		SubThread sThread = new SubThread();
		sThread.start();
		Thread.currentThread().setName("123");
		*/
		
		
		/*RunnableDemo rDemo = new RunnableDemo();
		Thread thread = new Thread(rDemo);
		thread.start();
		 */
		
		//Thread.currentThread返回当前运行的线程对象，通过对象可以得到线程名称
		System.out.println("main Thread: "+ Thread.currentThread().getName());
		
		/*for(int i = 0; i < 50; i++) {
			Thread.sleep(50);
			System.out.println("main ---- "+ i);
		}*/
		
		//匿名内部类创建线程方法1
		new Thread() {
			public void run() {
				System.out.println("111");
			};
		}.start();
		
		//匿名内部类创建线程方法2,使用接口方式
		new Thread(new Runnable() {
			public void run() {
				System.out.println("222");
			}
		}).start();
		
	}
}

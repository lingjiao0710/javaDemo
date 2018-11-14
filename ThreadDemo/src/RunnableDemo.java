/**
 * 使用runnable创建线程
 * @author Flj
 *
 */
public class RunnableDemo implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("run ---- %d\n", i);
		}
	}
}

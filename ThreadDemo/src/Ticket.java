import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
	private int tickets = 100;
	//使用ReentrantLock实现类
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			saleTicket();
		}
	}
	//同步方法
	//public synchronized void saleTicket() {
	public void saleTicket() {
		
		System.out.println(Thread.currentThread().getName() + ".....");
		lock.lock();
		if(tickets > 0) {
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName() + "出售第 " + tickets--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
			
		}else {
			lock.unlock();
		}
		
	}
}

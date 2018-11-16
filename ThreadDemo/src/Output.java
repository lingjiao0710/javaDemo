/**
 * 输出线程
 * @author Flj
 *
 */
public class Output implements Runnable{
	Resource r = Resource.resource;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			//Resource.lock.lock();
			
			synchronized (r) {
				if(r.flag == true) {
					System.out.println("outoutout1111");
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("outoutout2222");
					getResource();
					r.flag = false;
				}
			}
			//Resource.lock.unlock();
		}
	}
	
	void getResource() {
		System.out.println(r.name + "..." + r.sex);
	}
}

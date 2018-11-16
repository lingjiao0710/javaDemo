import com.sun.org.apache.regexp.internal.recompile;

/**
 * 输入线程，对资源对象进行交替赋值
 * @author Flj
 *
 */
public class Input implements Runnable{
	//private Resource r = new Resource();
	Resource r = Resource.resource;
	int i = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			//Resource.lock.lock();
			
			synchronized (r) {
				if(r.flag == false) {
					setResource();
					r.flag = true;
					r.notify();
					System.err.println("1111");
				}
			}
			//Resource.lock.unlock();
		}
	}
	
	void setResource(){
		if(i % 2 == 0) {
			r.setName("张三");
			r.setSex("男");
		}else {
			r.setName("李四");
			r.setSex("女");
		}
		i++;
	}
}

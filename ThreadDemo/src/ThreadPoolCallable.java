import java.util.concurrent.Callable;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class ThreadPoolCallable implements Callable<Integer>{
	private int a = 0;
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public ThreadPoolCallable(int a) {
		this.a = a;
	}
}

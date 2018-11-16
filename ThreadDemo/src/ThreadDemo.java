import java.util.concurrent.*;

import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;
import org.omg.PortableServer.ThreadPolicy;
import org.omg.PortableServer.ThreadPolicyValue;

import com.sun.corba.se.impl.orbutil.closure.Future;

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
	public static void main(String[] args) throws InterruptedException, ExecutionException {
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
		
		
		/**
		 * 使用线程池
		 */
		//调用 工厂 类的静态方法，创建线程池对象 ，返回线程池对象
		//ExecutorService es = Executors.newFixedThreadPool(3);
		//调用接口实现类对象es中的方法submit提交线程任务
		
		//使用Runnable接口
		//es.submit(new RunnableDemo());
		//es.submit(new RunnableDemo());
		//es.submit(new RunnableDemo());
		
		//使用Callable接口,返回Future接口实现类
		
		//java.util.concurrent.Future<Integer> f = es.submit(new ThreadPoolCallable(100));
		//java.util.concurrent.Future<Integer> f2 = es.submit(new ThreadPoolCallable(200));
		//System.out.println(f.get());
		//System.out.println(f2.get());
		//es.shutdown();
		
		
		/**
		 * 抢票
		 * 
		 */
		//Ticket ticket = new Ticket();
		//Thread thread1 = new Thread(ticket);
		//Thread thread2 = new Thread(ticket);
		//Thread thread3 = new Thread(ticket);
		//thread1.start();thread2.start();thread3.start();
		
		
		/**
		 * 开启输入输出线程，实现赋值和打印
		 */
		
		Input input = new Input();
		Output output = new Output();
		
		Thread inThread = new Thread(input);
		Thread ouThread = new Thread(output);
		
		inThread.start();
		ouThread.start();
		
	}
}

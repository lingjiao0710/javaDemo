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
 * ���������߳�
 * ����Thread�������
 * ���������÷���start()
 * JVM�����߳��е�run
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
		
		//Thread.currentThread���ص�ǰ���е��̶߳���ͨ��������Եõ��߳�����
		System.out.println("main Thread: "+ Thread.currentThread().getName());
		
		/*for(int i = 0; i < 50; i++) {
			Thread.sleep(50);
			System.out.println("main ---- "+ i);
		}*/
		
		//�����ڲ��ഴ���̷߳���1
		new Thread() {
			public void run() {
				System.out.println("111");
			};
		}.start();
		
		//�����ڲ��ഴ���̷߳���2,ʹ�ýӿڷ�ʽ
		new Thread(new Runnable() {
			public void run() {
				System.out.println("222");
			}
		}).start();
		
		
		/**
		 * ʹ���̳߳�
		 */
		//���� ���� ��ľ�̬�����������̳߳ض��� �������̳߳ض���
		ExecutorService es = Executors.newFixedThreadPool(3);
		//���ýӿ�ʵ�������es�еķ���submit�ύ�߳�����
		
		//ʹ��Runnable�ӿ�
		//es.submit(new RunnableDemo());
		//es.submit(new RunnableDemo());
		//es.submit(new RunnableDemo());
		
		//ʹ��Callable�ӿ�,����Future�ӿ�ʵ����
		
		java.util.concurrent.Future<Integer> f = es.submit(new ThreadPoolCallable(100));
		java.util.concurrent.Future<Integer> f2 = es.submit(new ThreadPoolCallable(200));
		System.out.println(f.get());
		System.out.println(f2.get());
		es.shutdown();
	}
}

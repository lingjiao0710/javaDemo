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
		
	}
}

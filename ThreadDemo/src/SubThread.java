
/**
 * 
 * @author Flj
 *	�������࣬�̳�Thread
 *	��д����run
 */
public class SubThread extends Thread{
	public SubThread() {
		// TODO Auto-generated constructor stub
		setName("1234");
	}
	public void run() {
		//�쳣����ʾ��Thread-0��
		//System.out.println(0/0);
		
		//��ȡ�߳�����
		System.out.println(getName());
		
		for(int i = 0; i < 50; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("%s ---- %d\n", getName(), i);
		}
	}
}

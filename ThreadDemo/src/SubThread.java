
/**
 * 
 * @author Flj
 *	定义子类，继承Thread
 *	重写方法run
 */
public class SubThread extends Thread{
	public SubThread() {
		// TODO Auto-generated constructor stub
		setName("1234");
	}
	public void run() {
		//异常会显示“Thread-0”
		//System.out.println(0/0);
		
		//获取线程名字
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

import java.lang.Thread.State;

public class AllThreadState {
	public static void main(String[] args) {
		//lambda表达式推导
		Thread t = new Thread(()->{
			System.out.println("....");
			for(int i = 0; i < 5; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}); 
		
		
		//NEW
		State s = t.getState();
		System.out.println(s);
		
		t.start();
		//RUNNABLE
		s = t.getState();
		System.out.println(s);
			
		while(s != Thread.State.TERMINATED) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//TIMED_WAITING
			s = t.getState();
			System.out.println(s);
		}
		
		//TERMINATED
		s = t.getState();
		System.out.println(s);
	}
}

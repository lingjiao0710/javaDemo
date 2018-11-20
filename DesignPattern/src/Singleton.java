
public class Singleton {
	private Singleton() {}
	
	//类初始化时立即加载
	public static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
}


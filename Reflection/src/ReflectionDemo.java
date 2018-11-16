

public class ReflectionDemo {
	
	public static void main(String[] args) throws Exception {
		//三种方式
		//1.对象.getClass()
		@SuppressWarnings("rawtypes")
		//Class cls = new Iphone().getClass();
		
		//2.�?.class()
		//cls = Iphone.class;
		
		//3.Class.forName("包名.类名")
		Class cls = Class.forName("com.flj.reflection.Iphone");
		
		//创建对象
		//不推荐这种方�?
		//Iphone i2 = (Iphone) cls.newInstance();
		
		//推荐
		Iphone i2 = (Iphone) cls.getConstructor().newInstance();
		System.out.println(i2);
	}
	
	
}

class Iphone{
	public Iphone() {
		
	}
}

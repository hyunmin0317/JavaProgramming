package exercises.week07;
public class SingletonThread4 { 
	// inner static class 
	private static class InnerSingleton {
		static final SingletonThread4 inst = new SingletonThread4(); 
	}
	private SingletonThread4() { } 
	public static SingletonThread4 getInstance() { 
		return InnerSingleton.inst; 
	}
}
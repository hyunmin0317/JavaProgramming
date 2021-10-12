package exercises.week07;

public class SingletonThread3 { 
	private volatile static SingletonThread3 inst; 
	private SingletonThread3() { } 
	public static SingletonThread3 getInstance() { 
		if (inst == null) { 
			synchronized (SingletonThread3.class) 	{ 
				if (inst == null) { 
					inst = new SingletonThread3(); 
				} 
			}
		} 
		return inst;
	}
	// 나머지 멤버 함수 코드 
}
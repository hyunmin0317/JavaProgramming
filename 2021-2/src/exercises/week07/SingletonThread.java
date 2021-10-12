package exercises.week07;

public class SingletonThread { 
	private static SingletonThread uniqueInstance; 
	private SingletonThread() { } 
	// synchronized -> 동기화
	public static synchronized SingletonThread getInstance() { 
		if (uniqueInstance == null) { 
			uniqueInstance = new SingletonThread(); 
		} 
		return uniqueInstance; 
	} // 나머지 멤버 함수 코드 
}
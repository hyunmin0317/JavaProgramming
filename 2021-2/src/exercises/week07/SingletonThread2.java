package exercises.week07;

public class SingletonThread2 { 
	private static SingletonThread2 inst = new SingletonThread2(); 
	private SingletonThread2() { } 
	// 비효율적이며 속도 느려지는 문제 해결
	public static SingletonThread2 getInstance() { 
		return inst; 
	} 
	// 나머지 멤버 함수 코드 
}
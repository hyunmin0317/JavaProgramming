package exercises.week07;

public class ChocolateBoiler {
	private static ChocolateBoiler uniqueInstance;
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true; // 보일러가 비어있을 때만 동작
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}

	// 나머지 멤버 함수 코드
}

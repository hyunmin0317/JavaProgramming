package assignments.assignment03;

// 옵저버를 관리하는 인터페이스
public interface Observable {
	public void registerObserver(Observer o);	// 옵저버를 추가하는 메서드
	public void removeObserver(Observer o);		// 옵저버를 삭제하는 메서드
	public void notifyObservers();				// 옵저버를 수정하는 메서드
}
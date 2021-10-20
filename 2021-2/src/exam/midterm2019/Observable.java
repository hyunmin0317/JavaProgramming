package exam.midterm2019;

public interface Observable {
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

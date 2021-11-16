package assignments.assignment03_2;

public interface Observable {
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

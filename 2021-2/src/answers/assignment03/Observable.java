package answers.assignment03;

public interface Observable {
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

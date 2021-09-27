package exercises.week04;

public interface Subject {
	public void registerObserver(Observers o);
	public void removeObserver(Observers o);
	public void notifyObservers();
}


package exercises.week14.example01;

public interface BeatModelInterface {
	void initialize();
  
	void on();
  
	void off();
  
    void setBPM(int bpm);
  
	int getBPM();
  
	void registerObserver(BeatObserver o);
	
	void registerObserver(BPMObserver o);
  
	void removeObserver(BeatObserver o);
  
	void removeObserver(BPMObserver o);
}

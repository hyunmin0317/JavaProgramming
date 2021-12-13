package exercises.week10_2;

public class Tuner {
	String description;
	Amplifier amplifier;
	double frequency;
	
	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
	
	
	void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	public void on() {
		System.out.println("Tuner on\n");
	}
	
	public void off() {
		System.out.println("Tuner off\n");
	}
}

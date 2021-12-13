package exercises.week10_2;

public class Amplifier {
	String description;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	
	public void on() {
		System.out.println("Amplifier on\n");
	}
	
	public void off() {
		System.out.println("Amplifier off\n");
	}
	
	public void setDvd(DvdPlayer dvd) {
		this.dvd = dvd;
	}
	
	public void setCd(CdPlayer cd) {
		this.cd = cd;
	}
	
	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}
	
	public void setVolume(int volume) {
		System.out.println("Set Volume: "+volume+"\n");
	}
	
	public void setSurroundSound() {
		System.out.println("Set SurroundSound\n");
	}
	
	public void setStereoSound() {
		System.out.println("Set StereoSound\n");
	}
}

package exercises.week10_2;

public class DvdPlayer {
	String description;
	Amplifier amplifier;
	String movie;
	
	public void on() {
		System.out.println("DvdPlayer on\n");
	}
	
	public void off() {
		System.out.println("DvdPlayer off\n");
	}
	
	public void play(String dvd) {
		System.out.println("DvdPlayer play "+dvd+"\n");	
	}
	
	public void stop() {
		System.out.println("DvdPlayer stop\n");
	}
	
	public void eject() {
		System.out.println("DvdPlayer eject\n");
	}
}

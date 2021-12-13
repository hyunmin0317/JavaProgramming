package exercises.week10_2;

public class Projector {
	String description;
	DvdPlayer dvdPlayer;
	
	public Projector(String description, DvdPlayer dvdPlayer) {
		this.description = description;
		this.dvdPlayer = dvdPlayer;
	}
	
	public void on() {
		System.out.println("Projector on\n");
	}
	
	public void off() {
		System.out.println("Projector off\n");
	}
	
	public void wideScreenMode() {
		System.out.println("Projector wideScreenMode\n");
	}
}

package exercises.week11;

public class Light {
	
	String place;
	
	public Light() {
		this.place = "";
	}
	
	public Light(String place) {
		this.place = place;
	}
	
	public void on() {
		System.out.println(place + " On the Light\n");
	}
	
	public void off() {
		System.out.println(place + " Off the Light\n");
	}
}

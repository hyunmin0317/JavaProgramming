package exercises.week10_2;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		// 컴포넌트 객체 생성 코드
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner("tuner", amp);
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector("projector", dvd);
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}

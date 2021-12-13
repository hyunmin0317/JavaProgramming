package exercises.week10_2;
public class HomeTheaterFacade {
	private Amplifier amp;
	private Tuner tuner;
	private DvdPlayer dvd;
	private CdPlayer cd;
	private Projector projector;
	private TheaterLights lights;
	private Screen screen;
	private PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier a, Tuner t, DvdPlayer d, CdPlayer c, Projector p, Screen s, TheaterLights l, PopcornPopper pp) {
		this.amp = a; 
		this.tuner = t; 
		this.dvd = d; 
		this.cd = c; 
		this.projector = p; 
		this.lights = l; 
		this.screen = s; 
		this.popper = pp;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		projector.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	// 기타 메소드
}
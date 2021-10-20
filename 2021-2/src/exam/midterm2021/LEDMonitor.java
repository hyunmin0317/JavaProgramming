package exam.midterm2021;

public class LEDMonitor extends AbstractExternalDevice {	
	// 생성자
	public LEDMonitor(String deviceType, AbstractNotebookComputer computer) {
		super(deviceType, computer);
		space = 150;				// LED모니터가 필요로 하는 공간: 150
	}
}

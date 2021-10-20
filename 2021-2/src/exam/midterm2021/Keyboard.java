package exam.midterm2021;

public class Keyboard extends AbstractExternalDevice {
	// 생성자
	public Keyboard(String deviceType, AbstractNotebookComputer computer) {
		super(deviceType, computer);
		space = 80;					// 키보드가 필요로 하는 공간: 80
	}
}

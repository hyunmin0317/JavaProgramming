package exam.midterm2021;

public class Mouse extends AbstractExternalDevice {	
	// 생성자
	public Mouse(String deviceType, AbstractNotebookComputer computer) {
		super(deviceType, computer);
		space = 30;					 // 마우스가 필요로 하는 공간: 30
	}
}

public class HardDrive extends AbstractExternalDevice {
	// 생성자
	public HardDrive(String deviceType, AbstractNotebookComputer computer) {
		super(deviceType, computer);
		space = 40;					// 하드디스크가 필요로 하는 공간: 40
	}
}

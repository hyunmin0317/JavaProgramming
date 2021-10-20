package exam.midterm2021;

public abstract class AbstractExternalDevice extends AbstractNotebookComputer {
	String deviceType;						// 장치의 이름
	AbstractNotebookComputer computer;		// 데코레이터 패턴 사용

	// 생성자
	public AbstractExternalDevice(String deviceType, AbstractNotebookComputer computer) {
		this.deviceType = deviceType;
		this.computer = computer;
	}

	// 장치의 이름을 반환하는 함수
	@Override
	public String toString() {
		return computer.toString()+", "+deviceType;
	}
	
	// 자식 클래스의 반복을 줄이기 위해 부모 클래스에 정의
	// 장치가 필요로 하는 공간을 반환하는 함수
	@Override
	public double requiredSpace() {
		return computer.requiredSpace()+space;
	}
}

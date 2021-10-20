public class NotebookComputer extends AbstractNotebookComputer {
	String owner;	// 노트북 주인의 이름
	
	// 생성자
	public NotebookComputer(String owner) {
		this.owner = owner;
		space = 250;		// 컴퓨터가 필요로 하는 공간: 250
	}
	
	// 컴퓨터의 이름을 반환하는 함수
	@Override
	public String toString() {
		return owner + "'s Notebook computer";
	}
	
	// 컴퓨터가 필요로 하는 공간을 반환하는 함수
	@Override
	public double requiredSpace() {
		return space;
	}
}

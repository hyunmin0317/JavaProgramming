package Exam.FinalExam;

public class GraphicArray {
	int count = 0;
	DObject[] arr = new DObject[100];
	public void add(DObject A) {
		arr[count] = A;
		count++;
	}
	public void delete() {
		if(count!=0)
			count--;
		else
			System.out.println("������ �� �����ϴ�.");
	}
	public void showAll() {
		if(count!=0)
			for(int i=count-1; i>=0; i--)
				arr[i].draw();		
		else
			System.out.println("����� ������ �����ϴ�.");
	}
}
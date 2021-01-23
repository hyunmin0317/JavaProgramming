package Test;

public class GraphicArray {
	int count = 0;
	DObject[] arr = new DObject[100];
	public void add(DObject A) {
		arr[count] = A;
		count++;
	}
	public void delete(int d) {
		if(count!=0) {
			if (d <= count) {
				for(int i=d-1; i<count; i++)
					arr[i] = arr[i+1];
                count--;
            } 
            else
                System.out.println("삭제할 수 없습니다.");
		}
		else
			System.out.println("삭제할 수 없습니다.");
			
	}
	public void showAll() {
		for(int i=0; i<count; i++)
			arr[i].draw();
	}
}
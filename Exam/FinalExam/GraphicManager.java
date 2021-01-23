package FinalExam;
import java.util.Scanner;

public class GraphicManager {
	public static void main(String[] args) {
		int option, graphic;
		GraphicArray A = new GraphicArray();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Add (1), Delete (2), Show ALL (3), End (4)>> ");
			option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.print("도형종류 Line(1), Rect(2), Circle(3)>> ");
				graphic = sc.nextInt();
				if (graphic == 1)
					A.add(new Line());
				else if(graphic == 2)
					A.add(new Rect());
				else if(graphic == 3)
					A.add(new Circle());
				else
					System.out.println("숫자를 잘못 입력했습니다.");
				break;
			case 2:
				A.delete();
				break;
			case 3:
				A.showAll();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("숫자를 잘못 입력했습니다.");
				}
			}
		}
	}
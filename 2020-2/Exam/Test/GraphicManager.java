package Exam.Test;
import java.util.Scanner;

public class GraphicManager {
	public static void main(String[] args) {
		int option, graphic, delete;
		GraphicArray A = new GraphicArray();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Add (1), Delete (2), Show ALL (3), End (4)>> ");
			option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.print("�������� Line(1), Rect(2), Circle(3)>> ");
				graphic = sc.nextInt();
				if (graphic == 1)
					A.add(new Line());
				else if(graphic == 2)
					A.add(new Rect());
				else if(graphic == 3)
					A.add(new Circle());
				else
					System.out.println("���ڸ� �߸� �Է��߽��ϴ�.");
				break;
			case 2:
				System.out.print("������ ������ ��ġ>>");
                delete = sc.nextInt();
				A.delete(delete);
				break;
			case 3:
				A.showAll();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				return;
			default:
				System.out.println("���ڸ� �߸� �Է��߽��ϴ�.");
				}
			}
		}
	}
		
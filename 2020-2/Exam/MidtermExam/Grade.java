package Exam.MidtermExam;
import java.util.Scanner;
// �߰����� 1�� ����
public class Grade {
	public static void main(String[] args) {
		String grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		grade = sc.next();
		
		switch(grade) {
		case "A":
		case "B":
		case "C":
			System.out.println("�� ���Ͽ����ϴ�.");
			break;
		case "D":
		case "E":
			System.out.println("�� �� ����ϼ���.");
			break;
		case "F":
			System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
			break;
		default:
			System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
			break;
		}
		sc.close();
	}
}
package MidtermExam;
import java.util.Scanner;
// 중간고사 1번 문제
public class Grade {
	public static void main(String[] args) {
		String grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 입력: ");
		grade = sc.next();
		
		switch(grade) {
		case "A":
		case "B":
		case "C":
			System.out.println("참 잘하였습니다.");
			break;
		case "D":
		case "E":
			System.out.println("좀 더 노력하세요.");
			break;
		case "F":
			System.out.println("다음 학기에 다시 수강하세요.");
			break;
		default:
			System.out.println("학점을 잘못 입력하였습니다.");
			break;
		}
		sc.close();
	}
}
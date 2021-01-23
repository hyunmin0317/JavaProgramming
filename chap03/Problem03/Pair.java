package Problem03;
import java.util.Scanner;

public class Pair {
	public static void main(String[] args) {
		String course [] = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		int i;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("과목 이름>> ");
			String str = sc.next();
			if (str.equals("그만"))
				break;
			for (i = 0; i<5; i++) {
				if (course[i].equals(str)) {
					System.out.println(course[i]+"의 점수는  "+score[i]);
					break;
				}
			}
			if (i == 5)
				System.out.println("없는 과목입니다.");
		}
		sc.close();		
	}
}
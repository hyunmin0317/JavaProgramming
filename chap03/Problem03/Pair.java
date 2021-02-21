package chap03.Problem03;
import java.util.Scanner;

public class Pair {
	public static void main(String[] args) {
		String course [] = {"java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		int i;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���� �̸�>> ");
			String str = sc.next();
			if (str.equals("�׸�"))
				break;
			for (i = 0; i<5; i++) {
				if (course[i].equals(str)) {
					System.out.println(course[i]+"�� ������  "+score[i]);
					break;
				}
			}
			if (i == 5)
				System.out.println("���� �����Դϴ�.");
		}
		sc.close();		
	}
}
package chap03.Problem03;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		String[] str = {"����", "����", "��"};
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�." );
		while (true) {
			int num = (int)(Math.random()*3);
			System.out.print("���� ���� ��!>> ");
			String user = sc.next();
			if (user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			else if (user.equals(str[num])) {
				System.out.println("����� = " +user+", ��ǻ�� = "+str[num]+", �����ϴ�.");
			}
			else if (user.equals("����")) {
				if (num == 1)
					System.out.println("����� = " +user+", ��ǻ�� = "+str[num]+", ��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("����� = " +user+", ��ǻ�� = "+str[num]+", ����ڰ� �̰���ϴ�.");
			}
			else if (user.equals("����")) {
				if (num == 0)
					System.out.println("����� = " +user+", ��ǻ�� = "+str[num]+", ����ڰ� �̰���ϴ�.");
				else
					System.out.println("����� = " +user+", ��ǻ�� = "+str[num]+", ��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if (user.equals("��")) {
				if (num == 0)
					System.out.println("����� = " +user+", ��ǻ�� = "+str[num]+", ��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("����� = " +user+", ��ǻ�� = "+str[num]+", ����ڰ� �̰���ϴ�.");
			}
			else
				System.out.println("�Է��� �߸��Ͽ����ϴ�.");
		}
		sc.close();
	}
}
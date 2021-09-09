package chap04.Problem04;
import java.util.Scanner;
//�ǽ�04-04
public class PhoneBook {
	public static void main(String[] args) {
		int n;
		int count;
		String name;
		Scanner sc = new Scanner(System.in);		
		System.out.print("�ο���>> ");
		n = sc.nextInt();
		Phone P[] = new Phone[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>> ");
			P[i] = new Phone(sc.next(), sc.next()); //�����ڸ� ���� �ʱ�ȭ
		}
		System.out.println("����Ǿ����ϴ�.");
		
		while(true) {
			count = 0;
			System.out.print("�˻��� �̸�>> ");
			name = sc.next();
			if (name.equals("�׸�")) {	//�׸��� �Է��Ҷ����� �ݺ�
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			for (int i = 0; i < n; i++) {
				if (name.equals(P[i].name)) {	//�˻��ϴ� �ܾ�� ����� �ܾ ������ �ش� ��ȣ ���
					System.out.println(P[i].name+"�� ��ȣ�� "+P[i].tel+"�Դϴ�.");
					count++;
				}
			}
			if (count == 0)
				System.out.println(name+" �� �����ϴ�.");
		}
		sc.close();
	}
}
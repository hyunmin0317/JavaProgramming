package chap04.Problem04;
import java.util.Scanner;
// �ǽ�04-03
public class Seat {
	Scanner sc = new Scanner(System.in);
    String seats[][] = new String[3][10];	//���ڿ��� ��� 2�����迭 ����

    public Seat() {	//������ ����
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 10; j++)
                this.seats[i][j] = "---";
    }

    void seat_watch(int seat) {		//�ش�� �ڸ���(�ε���) ���� ����ϴ� �޼ҵ�
        switch (seat) {
        case 1:
            System.out.print("S>> ");
            break;
        case 2:
            System.out.print("A>> ");
            break;
        case 3:
            System.out.print("B>> ");
            break;
        }
        for (int i = 0; i < 10; i++)
            System.out.print(this.seats[seat - 1][i] + " ");
        System.out.println();
    }

    void seat_reserve() {	//�ڸ��� �����ϴ� �޼ҵ�
        int seat;
        String name;
        int seat_Number;
        while (true) {
            System.out.print("�¼����� s<1>, A<2>, B<3>>> ");
            seat = sc.nextInt();	//�¼����� ����
            
            while(true) {
            	if(1<=seat && seat<=3)
            		break;
            	System.out.println("�ٽ� ���� ���ּ��� (1 ~ 3).");
            	seat = sc.nextInt();
            }

            System.out.print("�̸�>> ");
            name = sc.next();		//�̸� �Է�
            System.out.print("��ȣ>> ");
            seat_Number = sc.nextInt();	//�¼� ����

            while(true) {
            	if (seat_Number > 10 || seat_Number < 1) {	//���� ����
                    System.out.println("�߸� �Է��ϼ̽��ϴ� (1 ~ 10).");
                    System.out.println("�ٽ� ���� ���ּ��� (1 ~ 10)");
                    seat_Number = sc.nextInt();
                }
            	else if (!this.seats[seat - 1][seat_Number - 1].equals("---")) {
                    System.out.println("�̹� ����� �¼��Դϴ�.");	
                    System.out.println("�ٽ� ���� ���ּ��� (1 ~ 10)");
                    seat_Number = sc.nextInt();
                }
            	else {	//�ش�� �ڸ��� �̸�(name)���� �ٲ�
            		this.seats[seat - 1][seat_Number - 1] = name;
            		System.out.println("����Ǿ����ϴ�.");
            		break;
            	}
            }
            break;
        }
    }

    void seat_check() { //�ڸ��� ��ȸ�ϴ� �޼ҵ�
        for (int i = 0; i < 3; i++) {	//��� �ڸ� ���
            if (i == 0)
                System.out.print("S>> ");
            else if (i == 1)
                System.out.print("A>> ");
            else if (i == 2)
                System.out.print("B>> ");
            for (int j = 0; j < 10; j++) {
                System.out.print(this.seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
    }

    void seat_cancle() {	//������ ����ϴ� �޼ҵ�
        int seat;
        String name;

        while (true) {
            System.out.print("�¼����� s<1>, A<2>, B<3>>> ");
            seat = sc.nextInt();	//����Ϸ��� �ڸ��� �Է�
            seat_watch(seat);

            System.out.print("�̸�>> ");
            name = sc.next();	//����Ϸ��� ���� �̸� �Է�
            
            for (int i = 0; i < 3; i++) {
            	for (int j = 0; j < 10; j++) {
            		if (this.seats[i][j].equals(name)) {
                         this.seats[i][j] = "---";
                         System.out.println("��ҵǾ����ϴ�.");
                         return;
                         }
            		}
            	}
            System.out.println("����� �̸��� �����ϴ�.");
            }
    }
}
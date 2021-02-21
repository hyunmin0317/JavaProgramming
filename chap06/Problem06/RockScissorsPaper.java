package chap06.Problem06;
import java.util.Scanner;
// �ǽ� 06-05
public class RockScissorsPaper {
	static String change(int num) {	// ���ڸ� ����, ����, ���� �ٲ��ִ� static �޼ҵ�
		if (num==1)
			return "����";
		else if (num==2)
			return "����";
		else
			return "��";
	}
	static void result(int com, int user) {	// ����, ����, ���� ����� ����ϴ� static �޼ҵ�
        if(com == user)	// ��ǻ�Ϳ� ����ڰ� ������ ������
            System.out.println("�����ϴ�.");
        else {
            if(com==3 && user==1)	// ��ǻ�ʹ� �� ����ڴ� �����϶�
                System.out.println("�̰���ϴ�.");
            else if(com==1 && user==3)	// ��ǻ�ʹ� ���� ����ڴ� ���϶�
                System.out.println("�����ϴ�.");
            else {
                if(com>user)	// ��ǻ�ʹ� �� ����ڴ� �����϶�, ��ǻ�ʹ� ���� ����ڴ� �����϶�
                    System.out.println("�����ϴ�.");
                else	// ��ǻ�ʹ� ���� ����ڴ� �����϶�, ��ǻ�ʹ� ���� ����ڴ� ���϶�
                    System.out.println("�̰���ϴ�.");
            }
        }
	}
    public static void main(String[] args) {
        int com, user;
        char a;
        Scanner sc = new Scanner(System.in);
        System.out.println("����, ����, �� ���� ���α׷�");
        while(true) {
            do {
            	System.out.print("����(1), ����(2), ��(3)�� �Է�: ");
            	user = sc.nextInt();	// ����� �Է�
            } while(user!=1 && user!=2 && user!=3);	// 1, 2, 3 �� �ϳ��� �Է��Ҷ����� �ݺ�
            com = (int)Math.round(Math.random()*2) + 1; // 1���� 3������ ������ �� num ����
            System.out.println("�����: "+change(user)+", ��ǻ��: "+change(com));	// static �޼ҵ� change�� ���� ������ ������ ������
            result(com, user);	// static �޼ҵ� result�� ���� ����, ����, �� ����� ���
            do {
            	System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n): ");
                a = sc.next().charAt(0);
            } while(a!='y' && a!= 'n');	// y�� n�� �Է��Ҷ����� �ݺ�
            if(a=='y')	// y�̸� �ݺ��� �ٽ� ����
        		continue;
            if(a=='n') {	// n�̸� �ݺ��� ����
            	System.out.println("���α׷��� �����մϴ�.");
            	break;
            }
        }
        sc.close();
    } 
}
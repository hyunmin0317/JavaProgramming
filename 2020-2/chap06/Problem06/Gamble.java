package chap06.Problem06;
import java.util.Scanner;
// �ǽ� 06-02
public class Gamble {
    public static void main(String[] args) {
    	int i = 0;	// ���� Ƚ���� ��Ÿ���� ������ ���� ��Ÿ���� ���� �ʿ���
    	int num1, num2, num3;	// ������ ���� 3���� ����
        Scanner sc = new Scanner(System.in);
        System.out.println("������ ����");
        System.out.print("1p �Է�: ");
        String p1 = sc.nextLine();	// 1p�� �̸� �Է�
        System.out.print("2p �Է�: ");
        String p2 = sc.nextLine();	// 2p�� �̸� �Է�
        while(true){
            if(i%2 == 0)	// ���� Ƚ���� ¦���̸� p1�� ����
                System.out.println("p1: "+p1+" ����");
            else	// ���� Ƚ���� Ȧ���̸� p2�� ����
                System.out.println("p2: "+p2+" ����");
            System.out.print("<Enter> Ű �Է�");
            if(sc.nextLine().equals("")) {	// enter�� �Է� ��
                num1 = (int)Math.round(Math.random()*3); // 0���� 3������ ������ �� num1 ����
                num2 = (int)Math.round(Math.random()*3); // 0���� 3������ ������ �� num2 ����
                num3 = (int)Math.round(Math.random()*3); // 0���� 3������ ������ �� num3 ����
                System.out.println(num1+" "+num2+" "+num3);
                if(num1 == num2 && num2 == num3) {	// 3���� ���ڰ� ��� ������
                    if(i%2 == 0)
                        System.out.println("p1: "+p1+" Win");
                    else
                        System.out.println("p2: "+p2+" Win");
                    break;
                }
                i++;
            }
            
        }
        sc.close();
    }
}
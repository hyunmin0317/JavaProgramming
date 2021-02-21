package chap04.Problem04;
import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        Seat st = new Seat();
        Scanner sc = new Scanner(System.in);
        int select;
        while (true) {
            System.out.print("����<1>, ��ȸ<2>, ���<3>, ������<4>>> ");
            select = sc.nextInt();
            switch (select) {	//�Էµ� ��ȣ�� ���� �ٸ� �޼ҵ� ����
            case 1:
                st.seat_reserve();
                break;
            case 2:
                st.seat_check();
                break;
            case 3:
                st.seat_cancle();
                break;
            case 4:
            	System.out.println("���α׷��� �����մϴ�.");
            	sc.close();
                return;
            default:
                System.out.println("�߸� �Է��ϼ̽��ϴ� (1 ~ 4).");
                continue;
            }
        }
    }
}
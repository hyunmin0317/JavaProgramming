package chap05.Problem05;
import java.util.Scanner;
// �ǽ� 05-02
class DObject {
    public void draw() {
    	System.out.println("DObject");
    }
}
 
class Line extends DObject {	// ����Ŭ���� DObject�� ��ӹ޾� ����Ŭ���� Line�� ����
    public void draw() {
        System.out.println("Line");
    }
}
 
class Rect extends DObject {	// ����Ŭ���� DObject�� ��ӹ޾� ����Ŭ���� Rect�� ����
    public void draw() {
        System.out.println("Rect");
    }
}
 
class Circle extends DObject {	// ����Ŭ���� DObject�� ��ӹ޾� ����Ŭ���� Circle�� ����
    public void draw() {
        System.out.println("Circle");
    }
}

public class Graphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DObject dObjects[] = new DObject[100];
        int count = 0;
        int select, add, delete;
        while (true) {
        	System.out.print("����(1), ����(2), ��� ����(3), ����(4)>> ");
            select = sc.nextInt();
            switch (select) {
            case 1:	//����
                System.out.print("���� ���� Line(1), Rect(2), Circle(3)>> ");
                add = sc.nextInt();
                if (add == 1) {	// 1�� ���ý� Line ����
                    dObjects[count] = new Line();
                    count++;
                } else if (add == 2) {	// 2�� ���ý� Rect ����
                    dObjects[count] = new Rect();
                    count++;
                } else if (add == 3) {	// 3�� ���ý� Circle ����
                    dObjects[count] = new Circle();
                    count++;
                } else {	// ���� ���� �� ����
                    System.out.println("Select 1~3");
                }
                break;
            case 2:	// ����
                if (count != 0) {
                    System.out.print("������ ������ ��ġ>>");
                    delete = sc.nextInt();
                    if (delete <= count) {	// ������ �ε����� ���� ���϶�
                        for (int i = delete - 1; i < count; i++) {	// ������ �ε����� ��ĭ�� �̵�
                            dObjects[i] = dObjects[i + 1];
                        }
                        count--;
                    } 
                    else {	// ������ �ε����� ���� ���϶�
                        System.out.println("������ �� �����ϴ�.");
                    }
                } 
                else {	// ����� ������ ������
                    System.out.println("������ ������ �����ϴ�.");
                }
                break;
            case 3:	// ��� ����
                if (count != 0) {	// ����� ������ ������
                    for (int i = 0; i < count; i++) {	// ����� ��� ������ ���
                        dObjects[i].draw();
                    }
                } 
                else {	// ����� ������ ������
                    System.out.println("����� ������ �����ϴ�.");
                }
                break; 
            case 4:	// ����
                System.out.println("���α׷��� �����մϴ�.");
                sc.close();
                return;
            default:	// ���� �� ���ڸ� �Է�������
                System.out.println("�߸� �Է��ϼ̽��ϴ� (1 ~ 4).");
                continue;
            }
        }
    }
}
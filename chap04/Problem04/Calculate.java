package chap04.Problem04;
import java.util.Scanner;
//����04-06
public class Calculate {
	public static void main(String[] args) {
		int a, b;
		String c;
		
		Scanner sc = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.next();
		
		if(c.equals("+")) {		//�����ڰ� +�϶� add�� calculate �޼ҵ� ����
			add.setValue(a, b);
			System.out.println(add.calculate());
		}
		else if(c.equals("-")) {	//�����ڰ� -�϶� div�� calculate �޼ҵ� ����
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		}
		else if(c.equals("*")) {	//�����ڰ� *�϶� mul�� calculate �޼ҵ� ����
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		}
		else if(c.equals("/")) {	//�����ڰ� /�϶� div�� calculate �޼ҵ� ����
			if(b==0)	//����ó��
				System.out.println(b+"���� ���� �� �����ϴ�.");
			else {
				div.setValue(a, b);
				System.out.println(div.calculate());
			}
		}
		else
			System.out.println("�����ڸ� �ٽ� �Է��Ͻÿ�.");
		sc.close();
	}
}
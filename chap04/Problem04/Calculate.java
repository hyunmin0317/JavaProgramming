package Problem04;
import java.util.Scanner;
//예제04-06
public class Calculate {
	public static void main(String[] args) {
		int a, b;
		String c;
		
		Scanner sc = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.next();
		
		if(c.equals("+")) {		//연산자가 +일때 add의 calculate 메소드 실행
			add.setValue(a, b);
			System.out.println(add.calculate());
		}
		else if(c.equals("-")) {	//연산자가 -일때 div의 calculate 메소드 실행
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		}
		else if(c.equals("*")) {	//연산자가 *일때 mul의 calculate 메소드 실행
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		}
		else if(c.equals("/")) {	//연산자가 /일때 div의 calculate 메소드 실행
			if(b==0)	//예외처리
				System.out.println(b+"으로 나눌 수 없습니다.");
			else {
				div.setValue(a, b);
				System.out.println(div.calculate());
			}
		}
		else
			System.out.println("연산자를 다시 입력하시오.");
		sc.close();
	}
}
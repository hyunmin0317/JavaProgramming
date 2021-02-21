package chap02.Problem02;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double num1, num2;
		String operand;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��Ģ���� ��� ���α׷�(+,-,%,*,/)>> ");
		num1 = sc.nextDouble();		
		operand = sc.next();		//�����ڸ� String������ ����
		num2 = sc.nextDouble();
		
		switch(operand) {
		case "+":	//�����ڰ� "+"�϶�
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case "-":	//�����ڰ� "-"�϶�
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case "%":	//�����ڰ� "%"�϶�
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
			break;
		case "*":	//�����ڰ� "*"�϶�
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case "/":	//�����ڰ� "/"�϶�
			if (num2 == 0)	//������ ���� num2�� 0�϶�
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			break;
		}
		sc.close();
	}
}
package Problem02;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double num1, num2;
		String operand;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사칙연산 계산 프로그램(+,-,%,*,/)>> ");
		num1 = sc.nextDouble();		
		operand = sc.next();		//연산자를 String형으로 받음
		num2 = sc.nextDouble();
		
		switch(operand) {
		case "+":	//연산자가 "+"일때
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case "-":	//연산자가 "-"일때
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case "%":	//연산자가 "%"일때
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
			break;
		case "*":	//연산자가 "*"일때
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case "/":	//연산자가 "/"일때
			if (num2 == 0)	//나누는 수인 num2가 0일때
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			break;
		}
		sc.close();
	}
}
package Problem02;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int money;
		int a, b, c, d, e, f, g, h, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("돈의 액수 입력: ");		
		money = sc.nextInt();				//Scanner와 nextInt를 통해 돈의 액수를 int형으로 money에 저장 
		
		a = money / 50000;																//오만원권 개수
		b = (money % 50000) / 10000;													//만원권 개수
		c = ((money % 50000) % 10000) / 5000;											//오천원권 개수
		d = (((money % 50000) % 10000) % 5000) / 1000;									//천원권 개수
		e = ((((money % 50000) % 10000) % 5000) % 1000) / 500;							//500원짜리 동전 개수
		f = (((((money % 50000) % 10000) % 5000) % 1000) % 500) / 100;					//100원짜리 동전 개수
		g = ((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;			//50원짜리 동전 개수
		h = (((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;	//10원짜리 동전 개수
		i = (((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10;	//1원짜리 동전 개수
		
		System.out.print("오만원권 "+a+"매, 만원권 "+b+"매, 오천원권 "+c+"매, 천원권"+d+"매, 500원짜리 동전"+e);
		System.out.println("개, 100원짜리 동전 "+f+"개, 50원짜리 동전"+g+"개, 10원짜리 동전 "+h+"개, 1원짜리 동전"+i+"개 이다.");
		sc.close();
	}
}
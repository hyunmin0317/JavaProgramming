package Problem02;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		int num;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		if (num%10==3 || num%10==6 || num%10==9)	//숫자 num 1의 자리가 3, 6, 9중 하나일때
			count++;
		if (num/10==3 || num/10==6 || num/10==9)	//숫자 num 10의 자리가 3, 6, 9중 하나일때
			count++;
		
		if (count==1)	//3, 6, 9가 1개 있을때
			System.out.println("박수짝");
		if (count==2)	//3, 6, 9가 2개 있을때
			System.out.println("박수짝짝");
		sc.close();
	}
}
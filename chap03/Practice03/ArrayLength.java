package chap03.Practice03;
import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int [5];
		double sum = 0;
		for (int i = 0; i<intArray.length; i++)
			intArray[i] = sc.nextInt();
		for (int i = 0; i<intArray.length; i++) 
			sum += intArray[i];
		System.out.print("�迭�� ���� ����� " + sum/intArray.length+"�Դϴ�.");
		sc.close();
	}
}
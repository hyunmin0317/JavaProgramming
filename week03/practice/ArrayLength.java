package Practice03;
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
		System.out.print("배열의 원소 평균은 " + sum/intArray.length+"입니다.");
		sc.close();
	}
}
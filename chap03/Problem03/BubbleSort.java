package chap03.Problem03;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int[] Array = new int[10];
		Scanner sc = new Scanner(System.in);
		int n;
		for (int i = 0; i<Array.length; i++) {
			n = sc.nextInt();
			Array[i] = n;
		}
		for (int i = 0; i<Array.length-1; i++) {
			for (int j = Array.length-1; j>i; j--) {
				if (Array[j-1]>Array[j]) {
					int x;
					x = Array[j-1];
					Array[j-1] = Array[j];
					Array[j] = x;
				}				
			}
		}
		for (int i = 0; i<Array.length; i++) {
			System.out.println(Array[i]);
		}
		sc.close();
	}	
}
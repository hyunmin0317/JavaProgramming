package Algorithm;
import java.util.Scanner;
// 1. The Longest Common Subsequence Problem
class LCS {								// �� ���ڿ��� ������ ��� �ش� ���ڿ��� LCS�� ���ϴ� Ŭ����
	String S1, S2;
	int s1, s2;
	char Arrow[][];
	int Length[][];
	
	LCS (String S1, String S2) {		// LCS�� ������
		this.S1 = S1;
		this.S2 = S2;
		s1 = S1.length();				// ���ڿ� S1�� ����
		s2 = S2.length();				// ���ڿ� S2�� ����
		Length = new int[s1+1][s2+1];	// Subsequence�� ���̸� ��� ���������
		Arrow = new char[s1+1][s2+1];	// ȭ��ǥ�� ��� �������迭
	}
	
	int LCSLength() {					// �� ���ڿ� LCS�� ���̸� ���ϴ� �޼ҵ�
		int i, j;
		for(i=0; i<s1+1; i++) {
			for(j=0; j<s2+1; j++) {
				if(i==0||j==0)
					Length[i][j] = 0;	// ���ڿ��� ���� i==0�� j==0�� ��� 0���� �ʱ�ȭ
				else {
					if (S1.charAt(i-1) == S2.charAt(j-1)) {			// ���ڿ��� �� ���ڰ� ���� �� LCS(i-1, j-1)+1�� LCS(i, j)�� ����
						Length[i][j] = Length[i - 1][j - 1] + 1;
						Arrow[i][j] = '��';
					}
					else {											// ���ڿ��� �� ���ڰ� ���� �� LCS(i, j-1)�� LCS(i-1, j) �� ū ���� LCS(i, j)�� ����
						if (Length[i - 1][j] >= Length[i][j - 1]) {
							Length[i][j] = Length[i - 1][j];
							Arrow[i][j] = '��';
						}
						else {
							Length[i][j] = Length[i][j - 1];
							Arrow[i][j] = '��';
						}	
					}	
				}
			}
		}
		return Length[s1][s2];			// �� ���ڿ� LCS�� ���̸� ��ȯ
	}
	
	void PrintLCS(int s1, int s2) {		// �� ���ڿ��� LCS�� ���
		if (s1 == 0 || s2 == 0)			// ���ڿ��� ���� ��
			return;
		if (Arrow[s1][s2] == '��') {		// S1[i-1] == S2[j-1] �϶�	
			PrintLCS(s1 - 1, s2 - 1);
			System.out.print(S1.charAt(s1-1));
		}
		else if (Arrow[s1][s2] == '��')	// c[i-1][j] >= c[i][j-1] �϶�		
			PrintLCS(s1 - 1, s2);
		else							// c[i-1][j] < c[i][j-1] �϶�					
			PrintLCS(s1, s2 - 1);
	}
	
	void PrintMatrix() {						// LCS�� ����� ����ϴ� �޼ҵ�
		int i, j;
		for (i = 0; i <= s1+1; i++) {
			for (j = 0; j <= s2+1; j++) {
				if (i == 0 && j == 0)			// ���ڿ��� ���� �� ���鹮�� ���
					System.out.print("   ");
				else if (i == 0) {				// S2�� ��� ���� ���
					if (j == 1)
						System.out.print("   ");
					else
						System.out.print("  "+S2.charAt(j-2));
				}
				else if (j == 0) {				// S1�� ��� ���� ���
					if (i == 1)
						System.out.print("   ");
					else
						System.out.print("  "+S1.charAt(i-2));
				}
				else							// LCS ����� ��� �� ���
					System.out.printf(" %2d", Length[i-1][j-1]);
			}
			System.out.println();
		}
	}
}

public class LCSManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1, S2;
		LCS S;
		System.out.println("\n < 1.The Longest Common Subsequence Problem >\n");
		System.out.println(" - Input: two DNA sequences Adenine (A), Guanine (G), Cytosine (C) and Thymine (T)");
		System.out.print("   S1: ");
		S1 = sc.next();					// ���ڿ� S1 �Է�
		System.out.print("   S2: ");
		S2 = sc.next();					// ���ڿ� S2 �Է�
		S = new LCS(S1, S2);			// �����ڸ� ���� LCS�� ��ü S ����
		System.out.println("\n - Output: the Longest Common Subsequence (LCS) of the input sequences");
		System.out.println("   LCS ����: "+S.LCSLength());	// �޼ҵ� LCSLength�� ���� LCS�� ���� ���
		System.out.print("   LCS: ");
		S.PrintLCS(S.s1, S.s2);								// �޼ҵ� PrintLCS�� ���� LCS ���
		System.out.println("\n\n - LCS matrix");
		S.PrintMatrix();									// �޼ҵ� PrintMatrix�� ���� LCS ���
		sc.close();
	}
}
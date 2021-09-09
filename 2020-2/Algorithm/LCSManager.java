package Algorithm;
import java.util.Scanner;
// 1. The Longest Common Subsequence Problem
class LCS {								// 두 문자열의 정보를 담고 해당 문자열의 LCS를 구하는 클래스
	String S1, S2;
	int s1, s2;
	char Arrow[][];
	int Length[][];
	
	LCS (String S1, String S2) {		// LCS의 생성자
		this.S1 = S1;
		this.S2 = S2;
		s1 = S1.length();				// 문자열 S1의 길이
		s2 = S2.length();				// 문자열 S2의 길이
		Length = new int[s1+1][s2+1];	// Subsequence의 길이를 담는 이차원배렬
		Arrow = new char[s1+1][s2+1];	// 화살표를 담는 이차원배열
	}
	
	int LCSLength() {					// 두 문자열 LCS의 길이를 구하는 메소드
		int i, j;
		for(i=0; i<s1+1; i++) {
			for(j=0; j<s2+1; j++) {
				if(i==0||j==0)
					Length[i][j] = 0;	// 문자열이 없는 i==0과 j==0인 경우 0으로 초기화
				else {
					if (S1.charAt(i-1) == S2.charAt(j-1)) {			// 문자열의 두 문자가 같을 때 LCS(i-1, j-1)+1을 LCS(i, j)에 저장
						Length[i][j] = Length[i - 1][j - 1] + 1;
						Arrow[i][j] = '↖';
					}
					else {											// 문자열의 두 문자가 같을 때 LCS(i, j-1)과 LCS(i-1, j) 중 큰 값을 LCS(i, j)에 저장
						if (Length[i - 1][j] >= Length[i][j - 1]) {
							Length[i][j] = Length[i - 1][j];
							Arrow[i][j] = '↑';
						}
						else {
							Length[i][j] = Length[i][j - 1];
							Arrow[i][j] = '←';
						}	
					}	
				}
			}
		}
		return Length[s1][s2];			// 두 문자열 LCS의 길이를 반환
	}
	
	void PrintLCS(int s1, int s2) {		// 두 문자열의 LCS를 출력
		if (s1 == 0 || s2 == 0)			// 문자열이 없을 때
			return;
		if (Arrow[s1][s2] == '↖') {		// S1[i-1] == S2[j-1] 일때	
			PrintLCS(s1 - 1, s2 - 1);
			System.out.print(S1.charAt(s1-1));
		}
		else if (Arrow[s1][s2] == '↑')	// c[i-1][j] >= c[i][j-1] 일때		
			PrintLCS(s1 - 1, s2);
		else							// c[i-1][j] < c[i][j-1] 일때					
			PrintLCS(s1, s2 - 1);
	}
	
	void PrintMatrix() {						// LCS의 행렬을 출력하는 메소드
		int i, j;
		for (i = 0; i <= s1+1; i++) {
			for (j = 0; j <= s2+1; j++) {
				if (i == 0 && j == 0)			// 문자열이 없을 때 공백문자 출력
					System.out.print("   ");
				else if (i == 0) {				// S2의 모든 문자 출력
					if (j == 1)
						System.out.print("   ");
					else
						System.out.print("  "+S2.charAt(j-2));
				}
				else if (j == 0) {				// S1의 모든 문자 출력
					if (i == 1)
						System.out.print("   ");
					else
						System.out.print("  "+S1.charAt(i-2));
				}
				else							// LCS 행렬의 모든 값 출력
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
		S1 = sc.next();					// 문자열 S1 입력
		System.out.print("   S2: ");
		S2 = sc.next();					// 문자열 S2 입력
		S = new LCS(S1, S2);			// 생성자를 통해 LCS의 객체 S 생성
		System.out.println("\n - Output: the Longest Common Subsequence (LCS) of the input sequences");
		System.out.println("   LCS 길이: "+S.LCSLength());	// 메소드 LCSLength를 통해 LCS의 길이 출력
		System.out.print("   LCS: ");
		S.PrintLCS(S.s1, S.s2);								// 메소드 PrintLCS를 통해 LCS 출력
		System.out.println("\n\n - LCS matrix");
		S.PrintMatrix();									// 메소드 PrintMatrix를 통해 LCS 출력
		sc.close();
	}
}
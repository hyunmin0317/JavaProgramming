package chap03.Problem03;

public class TwoDArray {
	public static void main(String[] args) {
		int intArray[][] = {{0,0,0,0}, {0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int count = 0;
		while (count < 8) {
			int i = (int)(Math.random()*4);
			int j = (int)(Math.random()*4);
			if (intArray[i][j] == 0) {
				intArray[i][j] = (int)(Math.random()*9+1);
				count++;
			}			
		}
		for (int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
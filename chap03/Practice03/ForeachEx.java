package Practice03;

public class ForeachEx {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		String names[] = {"딸기", "수박", "바나나", "사과", "포도"};
		int sum = 0;	
		for (int k : num)
			sum+=k;
		System.out.println("합은" + sum +"이다.");
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();
	}
}
package MidtermExam;
// 중간고사 2번 문제
public class Sort {
	public static void BubbleSort(int[] arr) {
		int i, j; 
		int temp;
		for(i=arr.length-1; i>0; i--)
			for(j=0; j<i; j++)
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
	public static void Print(int[] arr) {
		int i;
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int i;
		int[] arr = new int[args.length];
		for(i=0; i<args.length; i++)
			arr[i] = Integer.parseInt(args[i]);
		Print(arr);
		BubbleSort(arr);
		Print(arr);
	}
}
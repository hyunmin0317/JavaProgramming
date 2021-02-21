package Exam.MidtermExam;
// �߰����� 5�� ����
class ArrayUtility {
	public static int[] concat(int[] s1, int[] s2) {
		int i,j;
		int arr[] = new int[s1.length+s2.length];
		for(i=0; i<s1.length; i++)
			arr[i] = s1[i];
		for(j=0; j<s2.length; j++)
			arr[i++] = s2[j];
		return arr;
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		int i,j, count;
		int size = s1.length;
		int[] arr;
		int[] save = new int[size];
		for(i=0; i<s1.length; i++) {
			count = 0;
			for(j=0; j<s2.length; j++)
				if(s1[i] == s2[j])
					count++;
			if(count==0)
				save[i] = s1[i];
			else
				size--;	
		}
		arr = new int[size];
		for(i=0; i<size; i++)
			arr[i] = save[i];
		return arr;
	}
	
	public static void print(int[] arr) {
		int i;
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}


public class ArrayUtilityManager {
	public static void main(String[] args) {
		int [] s1 = {1, 2, 3, 4};
		int [] s2 = {3, 4, 5, 6};	
		int [] concat, remove;	// ����� ���� int�� �迭 concat�� remove ����
		concat = ArrayUtility.concat(s1, s2);	//concat�޼ҵ带 ���� �� �迭�� ����
		remove = ArrayUtility.remove(s1, s2);	//remove�޼ҵ带 ���� �ٸ� ���� ����
		System.out.print("concat�� ��� : ");	
		ArrayUtility.print(concat);		//concat�� ��� ���
		System.out.print("remove�� ��� : ");
		ArrayUtility.print(remove);		//remove�� ��� ���
	}
}
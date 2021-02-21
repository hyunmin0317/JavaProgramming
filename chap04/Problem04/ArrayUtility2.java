package chap04.Problem04;
//�ǽ�04-01
public class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {	//�ι迭�� �����ϴ� �޼ҵ�
		int i, j;
		int[] array = new int[s1.length+s2.length];		//���ο� �迭 ����
		for(i=0; i<s1.length; i++)	//�迭 s1�� ���� ���ο� �迭 array�� ����
			array[i] = s1[i];
		for(j=0; j<s2.length; i++, j++)	//�迭 s1�� ���� ���ο� �迭 array�� ����
			array[i] = s2[j];
		return array;	//�ι迭�� ������ �迭 ��ȯ
	}
	static int[] remove(int[] s1, int[] s2) {	//�迭 s1���� �迭 s2�� ���� ���� �����ϴ� �޼ҵ�
		int i, j;
		int count = 0;	//�迭 s1���� �迭 s2�� ���� �ٸ� ���� ��
		int[] arr = new int[s1.length+s2.length];	//���ο� �迭 ����
		int[] array;
		for(i=0; i<s1.length; i++) {
			for(j=0; j<s2.length; j++)
				if(s1[i] == s2[j])	//�迭 s1�� ���� �迭 s2�� ���� ������
					break;
			if(j == s2.length) {	//�迭 s1�� ���� �迭 s2�� ���� �ٸ���
				arr[count] = s1[i];	//�迭�� ���� ����
				count++;
			}
		}
		array = new int[count];	//ũ�Ⱑ ���´� �迭 ������ ���� ����
		for(i=0; i<count; i++)
			array[i] = arr[i];
		return array;
	}
	static void print(int [] arr) {	//�迭�� ���� ����ϴ� �޼ҵ�
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
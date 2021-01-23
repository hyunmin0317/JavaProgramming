package Problem04;
//실습04-01
public class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {	//두배열을 연결하는 메소드
		int i, j;
		int[] array = new int[s1.length+s2.length];		//새로운 배열 생성
		for(i=0; i<s1.length; i++)	//배열 s1의 값을 새로운 배열 array에 복사
			array[i] = s1[i];
		for(j=0; j<s2.length; i++, j++)	//배열 s1의 값을 새로운 배열 array에 복사
			array[i] = s2[j];
		return array;	//두배열을 연결한 배열 반환
	}
	static int[] remove(int[] s1, int[] s2) {	//배열 s1에서 배열 s2와 같은 값을 삭제하는 메소드
		int i, j;
		int count = 0;	//배열 s1에서 배열 s2의 값과 다른 값의 수
		int[] arr = new int[s1.length+s2.length];	//새로운 배열 생성
		int[] array;
		for(i=0; i<s1.length; i++) {
			for(j=0; j<s2.length; j++)
				if(s1[i] == s2[j])	//배열 s1의 값과 배열 s2의 값이 같을때
					break;
			if(j == s2.length) {	//배열 s1의 값과 배열 s2의 값이 다를때
				arr[count] = s1[i];	//배열의 값을 저장
				count++;
			}
		}
		array = new int[count];	//크기가 딱맞는 배열 생성후 값을 복사
		for(i=0; i<count; i++)
			array[i] = arr[i];
		return array;
	}
	static void print(int [] arr) {	//배열의 값을 출력하는 메소드
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
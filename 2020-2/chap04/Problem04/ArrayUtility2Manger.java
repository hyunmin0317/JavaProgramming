package chap04.Problem04;
//�ǽ�4-1
public class ArrayUtility2Manger {
	public static void main(String[] args) {
		int [] s1 = {1,2,3,4,5,6,7,8,9};
		int [] s2 = {2,3,5,7};	
		int [] concat, remove;
		concat = ArrayUtility2.concat(s1, s2);	//concat�޼ҵ带 ���� �� �迭�� ����
		remove = ArrayUtility2.remove(s1, s2);	//remove�޼ҵ带 ���� �ٸ� ���� ����
		System.out.print("s1 : ");		
		ArrayUtility2.print(s1);
		System.out.print("s2 : ");		
		ArrayUtility2.print(s2);
		System.out.print("concat : ");	
		ArrayUtility2.print(concat);
		System.out.print("remove : ");
		ArrayUtility2.print(remove);
	}
}
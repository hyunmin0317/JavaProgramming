package chap04.Problem04;
import java.util.Scanner;
//�ǽ�04-05
public class DicManager {
	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {	//�׸��� �Է��Ҷ����� �ݺ�
			System.out.print("�ѱ� �ܾ�? ");
			word = sc.next();
			if(word.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}	//�˻��ϴ� �ܾ kor2Eng �޼ҵ�� �˻�
			System.out.println(word+"��(��) "+Dictionary.kor2Eng(word));
		}
		sc.close();
	}
}
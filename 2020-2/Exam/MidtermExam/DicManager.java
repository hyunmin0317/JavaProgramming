package Exam.MidtermExam;
import java.util.Scanner;
// �߰����� 6�� ����
class Dictionary {
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word){	//�˻��ϴ� �ܾ��� ���ܾ ����ϴ� �޼ҵ�
		int i;
		for(i=0; i<kor.length; i++)
			if(kor[i].equals(word))
				return eng[i];
		return "���� ������ �����ϴ�.";
	}
}

public class DicManager {
	public static void main(String[] args) {
		String word = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� ���α׷� �Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			word = sc.next();
			if(word.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else
				System.out.println(word+"�� "+Dictionary.kor2Eng(word));	
		}
		sc.close();
	}
}
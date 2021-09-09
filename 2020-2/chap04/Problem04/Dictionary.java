package chap04.Problem04;
//�ǽ�04-05
public class Dictionary {
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word){	//�˻��ϴ� �ܾ��� ���ܾ ����ϴ� �޼ҵ�
		int i;
		for (i = 0; i < kor.length; i++)
			if (word.equals(kor[i]))	//�˻��ϴ� �ܾ kor�� ������ �׿� �ش��ϴ� ���ܾ� ��ȯ
				return eng[i];
		return "����  ������ �����ϴ�.";
	}
}
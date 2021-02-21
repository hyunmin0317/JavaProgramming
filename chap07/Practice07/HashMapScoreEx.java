package chap07.Practice07;
import java.util.*;
// ���� 7-6 : HashMap�� �̿��Ͽ� �ڹ� ������ ������ ��� �����ϴ� �ڵ� �ۼ�
public class HashMapScoreEx {
	public static void main(String[] args) {
		// ����� �̸��� ������ ����ϴ� HashMap �÷��� ����
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();	
		
		// 5 ���� ���� ����
		javaScore.put("��ȫ��", 97); 
		javaScore.put("Ȳ����", 34); 
		javaScore.put("�̿���", 98);
		javaScore.put("������", 70);		
		javaScore.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� :"+javaScore.size());
		
		// ��� ����� ���� ���. 
		// javaScore�� ��� �ִ� ��� (key, value) �� ���
		// key ���ڿ��� ���� ���� Set �÷��� ����
		Set<String> keys = javaScore.keySet();
		
		// key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name+":"+score);
		}
	}
}
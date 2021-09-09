package chap07.Practice07;
import java.util.*;
// ���� 7-7 HashMap�� �̿��� �л� ���� ����
class Student { // �л��� ǥ���ϴ� Ŭ����
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id; this.tel = tel;
	}
}
public class HashMapStudentEx {
	public static void main(String[] args) {
		// �л� �̸��� Student ��ü�� ������ �����ϴ� HashMap �÷��� ����
		HashMap<String, Student> map = new HashMap<String, Student>();		
		// 3 ���� �л� ����
		map.put("Ȳ����", new Student(1, "010-111-1111")); 
		map.put("�ѿ���", new Student(2, "010-222-2222"));
		map.put("�̿���", new Student(3, "010-333-3333"));		
		System.out.println("HashMap�� ��� ���� :" + map.size());
		// ��� �л� ���. map�� ��� �ִ� ��� (key, value) �� ���
		// key ���ڿ��� ���� ���� Set �÷��� ����
		Set<String> names = map.keySet();
		 // key ���ڿ��� ������� ������ �� �ִ� Iterator ����
 		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next(); // ���� Ű. �л� �̸�
			Student student = map.get(name);
			System.out.println(name + " : " + student.id + " " + student.tel);
		}		
	}
}
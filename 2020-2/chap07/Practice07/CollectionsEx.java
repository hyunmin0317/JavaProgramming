package chap07.Practice07;
import java.util.*;
// ���� 7-8 : Collections Ŭ������ Ȱ��
public class CollectionsEx {
		static void printList(LinkedList<String> l) { 
			Iterator<String> iterator = l.iterator(); 
			while (iterator.hasNext()) { 
					String e = iterator.next(); 
					String separator;
					if (iterator.hasNext())
							separator = "->"; 
					else
							separator = "\n"; 
					System.out.print(e+separator);
			}
		}
		public static void main(String[] args) {
			LinkedList<String> myList = new LinkedList<String>(); 						
			myList.add("Ʈ��������");
			myList.add("��Ÿ����");
			myList.add("��Ʈ����");
			myList.add(0,"�͹̳�����");
			myList.add(2,"�ƹ�Ÿ");
			Collections.sort(myList); // ��� ����
			printList(myList); // ���ĵ� ��� ���
			Collections.reverse(myList); // ����� ������ �ݴ��
			printList(myList); // ��� ���
			int index = Collections.binarySearch(myList, "�ƹ�Ÿ") + 1; 
			System.out.println("�ƹ�Ÿ�� " + index + "��° ����Դϴ�.");
	}
}
package chap07.Practice07;
import java.util.Vector;
// ���� 7-1 : ���� ���� �ٷ�� Vector<Integer>
public class VectorEx {
	public static void main(String[] args) {
		int i, n;
		int sum = 0;
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		System.out.println("���� ���� ��� ��ü �� : " + v.size()); 
		System.out.println("������ ���� �뷮 : " + v.capacity()); 
		
		for(i=0; i<v.size(); i++) {
			n = v.get(i);
			System.out.println(n);
		}		
		
		for(i=0; i<v.size(); i++) {
			n = v.elementAt(i);
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}
}
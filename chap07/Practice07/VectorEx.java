package Practice07;
import java.util.Vector;
// 예제 7-1 : 정수 값만 다루는 Vector<Integer>
public class VectorEx {
	public static void main(String[] args) {
		int i, n;
		int sum = 0;
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		System.out.println("벡터 내의 요소 객체 수 : " + v.size()); 
		System.out.println("벡터의 현재 용량 : " + v.capacity()); 
		
		for(i=0; i<v.size(); i++) {
			n = v.get(i);
			System.out.println(n);
		}		
		
		for(i=0; i<v.size(); i++) {
			n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}
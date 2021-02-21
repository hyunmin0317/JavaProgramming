package chap07.Practice07;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		int i, l = 0;
		ArrayList <String> a = new ArrayList <String>();
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<4; i++) {
			System.out.print("�̸� �Է�: ");
			a.add(sc.next());
		}
		for(i=0; i<a.size(); i++)
			System.out.print(a.get(i)+" ");
		for(i=1; i<a.size(); i++)
			if(a.get(l).length() < a.get(i).length())
				l = i;
		System.out.println("\n���� �� �̸�: "+ a.get(l));
		sc.close();
	}
}
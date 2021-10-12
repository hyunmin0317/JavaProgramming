package exercises.week07;

import java.util.Iterator;
//import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		IntDynamicArray arr = new IntDynamicArray();
//		ArrayList arr = new ArrayList();
		for (int i = 0; i < 15; i++)
			arr.add(i);
		
//		System.out.println("for문과 get() 사용");
//		for (int i = 0; i < arr.size(); i++)
//			System.out.println(arr.get(i));
		
		System.out.println("for문과 iterator 사용");
		for (Iterator itr = arr.iterator(); itr.hasNext();)
			System.out.println(itr.next());
		
		System.out.println("for-each 구문 사용");
		for (Object n : arr)
			System.out.println((Integer) n);
	}

}

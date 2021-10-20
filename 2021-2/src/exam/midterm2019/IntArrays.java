package exam.midterm2019;

import java.util.Arrays;

public class IntArrays {
	private static final int SIZE = 50;
	
	Search s;
	int[] list;
	
	public IntArrays() {
		s = new binarySearch();
		list = new int[SIZE];
		for (int i=0; i<SIZE; i++) {
			list[i] = (int)(Math.random()*100+11);
		}
		Arrays.sort(list);
	}
	
	public void setSearch(Search s) {
		this.s = s;
	}
	
	public void searchs(int num) {
		if (s.search(num, list))
			System.out.println(num+"은 배열에 존재합니다.");
		else
			System.out.println(num+"은 배열에 존재하지 않습니다.");
	}
	
	public void print() {
		for (int i:list)
			System.out.println(i);
	}
}

package exam.midterm2019;

import java.util.ArrayList;

public class MainSearch {
	public static void main(String[] args) {
		IntArrays list = new IntArrays();	
		System.out.println("배열");
		list.print();
		System.out.println("binarySearch");
		list.setSearch(new binarySearch());
		list.searchs(53);
		list.searchs(95);
		
		System.out.println("linearSearch");
		list.setSearch(new linearSearch());
		list.searchs(17);
		list.searchs(77);

	}

}

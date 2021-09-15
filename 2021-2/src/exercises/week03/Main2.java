package exercises.week03;

import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		Person[] arr = new Person[5];
		arr[0] = new Person("Kim Pil", 20);
		arr[1] = new Person("Kim Min", 25);
		arr[2] = new Person("Cho Goo", 30);
		arr[3] = new Person("Lim Jung", 25);
		arr[4] = new Person("Min Guk", 28);
		
		System.out.println("원본 배열");
		for (Person p : arr) {
			System.out.println(p);
		}
		
		System.out.println("이름 순으로 정렬후 배열");
		Arrays.sort(arr, new NameComparator());
		for (Person p : arr) {
			System.out.println(p);
		}
		
		System.out.println("나이 순으로 정렬후 배열");
		Arrays.sort(arr, new AgeComparator());
		for (Person p : arr) {
			System.out.println(p);
		}
	}
}

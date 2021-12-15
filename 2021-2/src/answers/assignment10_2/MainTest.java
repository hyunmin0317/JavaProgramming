package answers.assignment10_2;

import java.util.Arrays;

public class MainTest {
	public static void main(String[] args) {
		Person[] people = {
			new Person(3000, "Dooly"),
			new Person(30, "Ddochi"),
			new Person(25, "Michol"),
			new Person(20000, "Douner"),
			new Person(3, "HeeDong")
		};
		System.out.println("\noriginal people");
		for (Person p : people) {
			System.out.println(p);
		}
		
		BubbleSorter sorter = new BubbleSorter();
		System.out.println("\nsort by Name");
//		NameSorter sorter1 = new NameSorter(sorter);
		NameSorter sorter1 = new NameSorter();
		sorter1.bubbleSort(people);
		for (Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("\nsort by Age");
//		AgeSorter sorter2 = new AgeSorter(sorter);
		AgeSorter sorter2 = new AgeSorter();
		sorter2.bubbleSort(people);
		for (Person p : people) {
			System.out.println(p);
		}
	}
}

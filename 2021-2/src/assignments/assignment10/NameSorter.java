package assignments.assignment10;

public class NameSorter extends Sorter {
	@Override
	public int compareTo(Person data1, Person data2) {
		return data1.getName().compareTo(data2.getName());
	}
}

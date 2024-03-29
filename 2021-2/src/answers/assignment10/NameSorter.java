package answers.assignment10;

public class NameSorter extends BubbleSorter{
	public void bubbleSort(Person[] data) {
        sort(data);
    }
	
	@Override
	public int compareTo(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
}

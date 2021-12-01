package answers.assignment10_2;

public class NameSorter implements BubbleSorterComparable{
//	BubbleSorter sorter;
//	
//	public NameSorter(BubbleSorter sorter) {
//		this.sorter = sorter;
//	}

	public void bubbleSort(Person[] data) {
        BubbleSorter.sort(data, this);
//        sorter.sort(data, this);
    }
	
	@Override
	public int compareTo(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
}

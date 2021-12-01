package answers.assignment10_2;

public class AgeSorter implements BubbleSorterComparable {
//	BubbleSorter sorter;
//	
//	public AgeSorter(BubbleSorter sorter) {
//		this.sorter = sorter;
//	}

	public void bubbleSort(Person[] data) {
		BubbleSorter.sort(data, this);
//        sorter.sort(data, this);
    }
	
	@Override
	public int compareTo(Person a, Person b) {
		return a.getAge() - b.getAge();
	}
}

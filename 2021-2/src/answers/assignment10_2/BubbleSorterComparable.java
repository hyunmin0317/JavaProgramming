package answers.assignment10_2;

public interface BubbleSorterComparable {
	// returns > 0 if a > b
	// returns < 0 if a < b
	// returns = 0 if a == b
	int compareTo(Person a, Person b);
}

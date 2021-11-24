package exercises.week13;

public class Duck implements Comparable {
	String name;
	int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name + ", 제충: " + weight;
	}
	
	public int compareTo(Object object) {
		Duck other = (Duck) object;
		if (weight < other.weight) { return -1; } 
		else if (weight == other.weight) { return 0; } 
		else { return 1; }
	}
}

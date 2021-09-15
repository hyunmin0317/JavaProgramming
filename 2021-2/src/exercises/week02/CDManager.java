package exercises.week02;

public class CDManager {
	public static void main(String[] args) {
		IDBLoader dbLoader = new DBLoader();
		dbLoader.loadCDs();
	}
}
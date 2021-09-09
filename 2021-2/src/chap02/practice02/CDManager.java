package chap02.practice02;

public class CDManager {
	public static void main(String[] args) {
		IDBLoader dbLoader = new DBLoader();
		dbLoader.loadCDs();
	}
}
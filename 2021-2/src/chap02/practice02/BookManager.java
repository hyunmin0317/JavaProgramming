package chap02.practice02;

public class BookManager {
	public static void main(String[] args) {
		IDBLoader dbLoader = new DBLoader();
		dbLoader.loadBooks();
	}
}
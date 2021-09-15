package exercises.week02;

public class BookManager2 { 
	public static void main(String[] args) { 
		IDBLoader dbLoader = new DBLoader(); 
		dbLoader.loadBooks(); 
		} 
	}
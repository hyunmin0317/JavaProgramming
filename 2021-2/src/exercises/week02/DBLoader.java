package exercises.week02;

public class DBLoader implements IDBLoader {
	public String getName() {
		return "blah";
	}
	
	public void loadBooks() {
		System.out.println("DBLoader::loadBooks() " + getName());
	}
	
	public void loadCDs() {
		System.out.println("DBLoader::loadCDs() " + getName());
	}
	
	public void loadMP3s() {
		System.out.println("DBLoader::loadMP3() " + getName());
	}
}

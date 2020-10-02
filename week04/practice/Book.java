package Practice04;
// 예제 4-5 : 생성자 정의와 호출
public class Book {
	String title;
	String author;
	int ISBN;
	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public static void main(String[] args) {
		Book javaBook = new Book("Java JDK", "황기태", 3333);
		System.out.println(javaBook.title+", "+javaBook.author+", "+javaBook.ISBN);
	}
}
package chap02.practice01;

public class Book {
	private String author;
    private int publishedYear;
    private double price;
    private String isbn;
	
    public Book(String author, int publishedYear, double price, String isbn) {
		super();
		this.author = author;
		this.publishedYear = publishedYear;
		this.price = price;
		this.isbn = isbn;
	}
    
    @Override
    public String toString() {
    	return "Book{" +
                "author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                ", price=" + price +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

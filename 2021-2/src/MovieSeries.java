import java.util.ArrayList;

public class MovieSeries {
	String name;
	int year;
	double discountRate;
	double totalPrice;
	
	ArrayList<Movie> movies;
	
	public MovieSeries(String name, int year, double discountRate) {
		this.name = name;
		this.year = year;
		this.discountRate = discountRate;
		totalPrice = 0;
		
		movies = new ArrayList<Movie>();
	}
	
	public boolean equals(MovieSeries m) {
		if (m.name == name & m.year == year) {
			return true;
		}
		return false;
	}
	
	public void add(Movie m) {
		for(Movie movie : movies) {
			if (movie.equals(m)) {
				movie.setPrice(m.getPrice());
			}
		}
		
		totalPrice += m.getPrice() * discountRate / 100;
		movies.add(m);
	}
	
	public void remove(Movie m) {
		if (movies.contains(m)) {
			movies.remove(m);
		}
		
		System.out.println("MovieSeries: 영화 "+m.getName()+"가 삭제되었습니다.\n");
	}
	
	public void list() {
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}
	
	public Movie getMovie(int idx) {
		return movies.get(idx);
	}

	@Override
	public String toString() {
		return "시리즈 이름: " + name + ", year=" + year + ", discountRate=" + discountRate + ", movies=" + movies
				+ "\n";
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}	
	
}

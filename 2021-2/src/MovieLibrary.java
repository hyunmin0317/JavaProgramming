import java.util.ArrayList;

public class MovieLibrary {
	String name;
	ArrayList<Movie> movies;
	ArrayList<MovieSeries> movieSeries;
	
	public MovieLibrary(String name) {
		this.name = name;
		
		movies = new ArrayList<Movie>();
		movieSeries = new ArrayList<MovieSeries>();
	}
	
	public void insert(Movie movie, boolean replace) {
		if (replace) {
			delete(movie);
			movies.add(movie);
		} else {
			movies.add(movie);
		}
		
		System.out.println("MovieLibrary: 영화 "+movie.getName()+"가 영화에 추가되었습니다.\n");
	}
	
	public void insert(MovieSeries movieseries, boolean replace) {
		if (replace) {
			delete(movieseries);
			movieSeries.add(movieseries);
		} else {
			movieSeries.add(movieseries);
		}
		System.out.println("MovieLibrary: 영화 시리즈 "+movieseries.getName() +"가 영화 시리즈에 추가되었습니다.\n");
	}
	
	public void delete(Movie movie) {
		if (movies.contains(movie)) {
			movies.remove(movie);
			System.out.println("MovieLibrary: 영화  "+movie.getName() +"가 삭제되었습니다.\n");
		} else {
			System.out.println("MovieLibrary: 존재하지 않는 영화입니다.\n");
		}
	}
	
	public void delete(MovieSeries movieseries) {
		if (movieSeries.contains(movieseries)) {
			movieSeries.remove(movieseries);
			System.out.println("MovieLibrary: 영화  "+movieseries.getName() +"가 삭제되었습니다.\n");
		} else {
			System.out.println("MovieLibrary: 존재하지 않는 영화입니다.\n");
		}
	}

	@Override
	public String toString() {
		return "MovieLibrary [name=" + name + ", movies=" + movies + ", movieSeries=" + movieSeries + "]";
	}
}

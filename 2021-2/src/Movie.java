
public class Movie {
	String name;
	int year;
	double price;
	String resolution;
	
	public Movie(String name, int year, int price, String resolution) {
		this.name = name;
		this.year = year;
		this.price = price;
		this.resolution = resolution;
	}
	// & m.year == year
	
	public boolean equals(Movie m) {
		if (m.name == name) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return " 영화: " + name + ", 가격: " + price + "\n";
	}

	
	public String getName() {
		return name;
	}

	public int getProductionYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public String getResolution() {
		return resolution;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductionYear(int year) {
		this.year = year;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
}

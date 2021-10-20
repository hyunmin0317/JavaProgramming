package exercises.week05;

import java.io.FileInputStream;

public class ReadFile { 
	public static void main(String[] args) {
		try {
			FileInputStream readme = new FileInputStream("read.txt");
			int b = readme.read();
			System.out.println("b = " + b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
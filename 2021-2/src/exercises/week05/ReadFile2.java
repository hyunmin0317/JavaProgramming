package exercises.week05;

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class ReadFile2 { 
	public static void main(String[] args) {
		try {
			BufferedInputStream readme = new BufferedInputStream(new FileInputStream("read.txt")); 
			int b = readme.read();
			System.out.println("b = " + b);
			} catch (Exception e) {
			e.printStackTrace();
			}
	}
}
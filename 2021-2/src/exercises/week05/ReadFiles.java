package exercises.week05;

import java.io.FileReader;
import java.io.LineNumberReader;

public class ReadFiles { 
	public static void main(String[] args) {
		try {
			LineNumberReader readme = new LineNumberReader(
			new FileReader("readme.txt"));
			String line = readme.readLine();
			System.out.println("line " + 
			readme.getLineNumber() + " = " + line);
			} catch (Exception e) {
			e.printStackTrace();
			}
	}
}
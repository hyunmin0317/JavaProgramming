package exercises.week05;

import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFiles2 { 
	public static void main(String[] args) {
		try {
			BufferedReader readme 
			= new BufferedReader(
			new FileReader("readme.txt"));
			String line = readme.readLine();
			System.out.println("line = " + line);
			}
			catch (Exception e) {
			e.printStackTrace();
			}

	}
}
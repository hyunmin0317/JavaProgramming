package exercises.week05;

import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFiles2 { 
	public static void main(String[] args) {
		try {
			BufferedReader readme 
			= new BufferedReader(
			new FileReader("read.txt"));
			String line = readme.readLine();
			System.out.println("line = " + line);
			line = readme.readLine();
			}
			catch (Exception e) {
			e.printStackTrace();
			}

	}
}
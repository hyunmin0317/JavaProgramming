package assignments.assignment04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {
	String displayFileName;
	ArrayList<String> list;
	
	LoadHudDisplays(String displayFileName) {
		this.displayFileName = displayFileName;
	}
	
	@Override
	public ArrayList<String> load() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader readme = new BufferedReader(new FileReader(displayFileName));
			String str;
			while ((str = readme.readLine()) != null) {
				list.add(str);
			}
			readme.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}

package answers.assignment04_2;

import java.io.*;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {
	private String fileName;
	
	public LoadHudDisplays(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public ArrayList<String> load() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}

package answers.assignment01;

import java.util.Map;
import java.util.HashMap;

public class WordProcessor {
	private ISpellChecker spellChecker;
	private Map<String, DocConverter> docConverters;
	private String fileName;
	
	WordProcessor(String fileName) {
		this.fileName = fileName;
		docConverters = new HashMap<String, DocConverter>();
	}
	
	public void addDocConverter(DocConverter converter) {
		docConverters.put(converter.getExtension(), converter);
	}
	
	public void convertDocTo(String ext) {
		if (docConverters.containsKey(ext)) {
			DocConverter c = docConverters.get(ext);
			c.save(fileName);
		} else {
			System.out.println(ext+"파일 형식을 지원하는 DocConverter가 없습니다.");
		}
	}
	
	public void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void checkSpelling() {
		if (spellChecker != null) {
			spellChecker.check();
		}
	}
}

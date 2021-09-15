package assignments.assignment01;

import java.util.Map;
import java.util.HashMap;

class WordProcessor {
	ISpellChecker spellChecker;
	Map<String, DocConverter> docConverters = new HashMap<String, DocConverter>();
	String fileName;

	public WordProcessor(String fileName) {
		this.fileName = fileName;
	}
	
	public void addDocConverter(DocConverter converter) {
		docConverters.put(converter.getExtension(), converter);
	}
	
	public void convertDocTo(String ext) {
		if(docConverters.containsKey(ext)) {
			System.out.println(fileName+"."+ext+"로 변환해서 저장합니다.");
		} else {
			System.out.println(ext+"파일 형식을 지원하는 DocConverter가 없습니다.");
		}
	}
	
	public void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void checkSpelling() {
		spellChecker.check();
	}
}

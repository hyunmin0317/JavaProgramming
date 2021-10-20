import java.util.HashMap;
import java.util.Map;

public class WordProcessor {
	ISpellChecker spellChecker;
	Map<String, DocConverter> docConverters;
	String fileName;
	
	public WordProcessor(String fileName) {
		this.fileName = fileName;
		docConverters = new HashMap<String, DocConverter>();
	}
	
	public void addDocConverter(DocConverter converter) {
		docConverters.put(converter.getExtension(), converter);
	}
	
	public void convertDocTo(String ext) {
		if (docConverters.containsKey(ext)) {
			DocConverter d = docConverters.get(ext);
			d.save(fileName);
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

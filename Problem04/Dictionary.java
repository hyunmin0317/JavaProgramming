package Problem04;
//실습04-05
public class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word){	//검색하는 단어의 영단어를 출력하는 메소드
		int i;
		for (i = 0; i < kor.length; i++)
			if (word.equals(kor[i]))	//검색하는 단어가 kor에 있을때 그에 해당하는 영단어 반환
				return eng[i];
		return "저의  사전에 없습니다.";
	}
}
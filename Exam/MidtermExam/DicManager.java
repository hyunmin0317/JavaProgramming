package MidtermExam;
import java.util.Scanner;
// 중간고사 6번 문제
class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word){	//검색하는 단어의 영단어를 출력하는 메소드
		int i;
		for(i=0; i<kor.length; i++)
			if(kor[i].equals(word))
				return eng[i];
		return "저의 사전에 없습니다.";
	}
}

public class DicManager {
	public static void main(String[] args) {
		String word = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 프로그램 입니다.");
		while(true) {
			System.out.print("한글 단어? ");
			word = sc.next();
			if(word.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else
				System.out.println(word+"는 "+Dictionary.kor2Eng(word));	
		}
		sc.close();
	}
}
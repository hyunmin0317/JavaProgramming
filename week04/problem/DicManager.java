package Problem04;
import java.util.Scanner;
//실습04-05
public class DicManager {
	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {	//그만을 입력할때까지 반복
			System.out.print("한글 단어? ");
			word = sc.next();
			if(word.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}	//검색하는 단어를 kor2Eng 메소드로 검색
			System.out.println(word+"은(는) "+Dictionary.kor2Eng(word));
		}
		sc.close();
	}
}
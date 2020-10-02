package Problem04;
import java.util.Scanner;
//실습04-04
public class PhoneBook {
	public static void main(String[] args) {
		int n;
		int count;
		String name;
		Scanner sc = new Scanner(System.in);		
		System.out.print("인원수>> ");
		n = sc.nextInt();
		Phone P[] = new Phone[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>> ");
			P[i] = new Phone(sc.next(), sc.next()); //생성자를 통해 초기화
		}
		System.out.println("저장되었습니다.");
		
		while(true) {
			count = 0;
			System.out.print("검색할 이름>> ");
			name = sc.next();
			if (name.equals("그만")) {	//그만을 입력할때까지 반복
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for (int i = 0; i < n; i++) {
				if (name.equals(P[i].name)) {	//검색하는 단어와 저장된 단어가 같을때 해당 번호 출력
					System.out.println(P[i].name+"의 번호는 "+P[i].tel+"입니다.");
					count++;
				}
			}
			if (count == 0)
				System.out.println(name+" 이 없습니다.");
		}
		sc.close();
	}
}
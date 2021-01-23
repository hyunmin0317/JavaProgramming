package Problem06;
import java.util.Scanner;
// 실습 06-05
public class RockScissorsPaper {
	static String change(int num) {	// 숫자를 가위, 바위, 보로 바꿔주는 static 메소드
		if (num==1)
			return "가위";
		else if (num==2)
			return "바위";
		else
			return "보";
	}
	static void result(int com, int user) {	// 가위, 바위, 보의 결과를 출력하는 static 메소드
        if(com == user)	// 컴퓨터와 사용자가 같은걸 냈을때
            System.out.println("비겼습니다.");
        else {
            if(com==3 && user==1)	// 컴퓨터는 보 사용자는 가위일떼
                System.out.println("이겼습니다.");
            else if(com==1 && user==3)	// 컴퓨터는 가위 사용자는 보일때
                System.out.println("졌습니다.");
            else {
                if(com>user)	// 컴퓨터는 보 사용자는 바위일때, 컴퓨터는 바위 사용자는 가위일때
                    System.out.println("졌습니다.");
                else	// 컴퓨터는 가위 사용자는 바위일때, 컴퓨터는 바위 사용자는 보일때
                    System.out.println("이겼습니다.");
            }
        }
	}
    public static void main(String[] args) {
        int com, user;
        char a;
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 게임 프로그램");
        while(true) {
            do {
            	System.out.print("가위(1), 바위(2), 보(3)를 입력: ");
            	user = sc.nextInt();	// 사용자 입력
            } while(user!=1 && user!=2 && user!=3);	// 1, 2, 3 중 하나를 입력할때까지 반복
            com = (int)Math.round(Math.random()*2) + 1; // 1부터 3까지의 임의의 수 num 생성
            System.out.println("사용자: "+change(user)+", 컴퓨터: "+change(com));	// static 메소드 change를 통해 각자의 선택을 보여줌
            result(com, user);	// static 메소드 result를 통해 가위, 바위, 보 결과를 출력
            do {
            	System.out.print("다시하시겠습니까(y/n): ");
                a = sc.next().charAt(0);
            } while(a!='y' && a!= 'n');	// y나 n을 입력할때까지 반복
            if(a=='y')	// y이면 반복을 다시 실행
        		continue;
            if(a=='n') {	// n이면 반복을 종료
            	System.out.println("프로그램을 종료합니다.");
            	break;
            }
        }
        sc.close();
    } 
}
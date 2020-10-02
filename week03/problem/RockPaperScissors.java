package Problem03;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		String[] str = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다." );
		while (true) {
			int num = (int)(Math.random()*3);
			System.out.print("가위 바위 보!>> ");
			String user = sc.next();
			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			else if (user.equals(str[num])) {
				System.out.println("사용자 = " +user+", 컴퓨터 = "+str[num]+", 비겼습니다.");
			}
			else if (user.equals("가위")) {
				if (num == 1)
					System.out.println("사용자 = " +user+", 컴퓨터 = "+str[num]+", 컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자 = " +user+", 컴퓨터 = "+str[num]+", 사용자가 이겼습니다.");
			}
			else if (user.equals("바위")) {
				if (num == 0)
					System.out.println("사용자 = " +user+", 컴퓨터 = "+str[num]+", 사용자가 이겼습니다.");
				else
					System.out.println("사용자 = " +user+", 컴퓨터 = "+str[num]+", 컴퓨터가 이겼습니다.");
			}
			else if (user.equals("보")) {
				if (num == 0)
					System.out.println("사용자 = " +user+", 컴퓨터 = "+str[num]+", 컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자 = " +user+", 컴퓨터 = "+str[num]+", 사용자가 이겼습니다.");
			}
			else
				System.out.println("입력을 잘못하였습니다.");
		}
		sc.close();
	}
}
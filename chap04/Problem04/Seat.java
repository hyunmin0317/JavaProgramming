package Problem04;
import java.util.Scanner;
// 실습04-03
public class Seat {
	Scanner sc = new Scanner(System.in);
    String seats[][] = new String[3][10];	//문자열이 담긴 2차원배열 생성

    public Seat() {	//생성자 지정
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 10; j++)
                this.seats[i][j] = "---";
    }

    void seat_watch(int seat) {		//해당된 자리의(인덱스) 정보 출력하는 메소드
        switch (seat) {
        case 1:
            System.out.print("S>> ");
            break;
        case 2:
            System.out.print("A>> ");
            break;
        case 3:
            System.out.print("B>> ");
            break;
        }
        for (int i = 0; i < 10; i++)
            System.out.print(this.seats[seat - 1][i] + " ");
        System.out.println();
    }

    void seat_reserve() {	//자리를 예약하는 메소드
        int seat;
        String name;
        int seat_Number;
        while (true) {
            System.out.print("좌석구분 s<1>, A<2>, B<3>>> ");
            seat = sc.nextInt();	//좌석구분 선택
            
            while(true) {
            	if(1<=seat && seat<=3)
            		break;
            	System.out.println("다시 선택 해주세요 (1 ~ 3).");
            	seat = sc.nextInt();
            }

            System.out.print("이름>> ");
            name = sc.next();		//이름 입력
            System.out.print("번호>> ");
            seat_Number = sc.nextInt();	//좌석 선택

            while(true) {
            	if (seat_Number > 10 || seat_Number < 1) {	//범위 오류
                    System.out.println("잘못 입력하셨습니다 (1 ~ 10).");
                    System.out.println("다시 선택 해주세요 (1 ~ 10)");
                    seat_Number = sc.nextInt();
                }
            	else if (!this.seats[seat - 1][seat_Number - 1].equals("---")) {
                    System.out.println("이미 예약된 좌석입니다.");	
                    System.out.println("다시 선택 해주세요 (1 ~ 10)");
                    seat_Number = sc.nextInt();
                }
            	else {	//해당된 자리를 이름(name)으로 바꿈
            		this.seats[seat - 1][seat_Number - 1] = name;
            		System.out.println("예약되었습니다.");
            		break;
            	}
            }
            break;
        }
    }

    void seat_check() { //자리를 조회하는 메소드
        for (int i = 0; i < 3; i++) {	//모든 자리 출력
            if (i == 0)
                System.out.print("S>> ");
            else if (i == 1)
                System.out.print("A>> ");
            else if (i == 2)
                System.out.print("B>> ");
            for (int j = 0; j < 10; j++) {
                System.out.print(this.seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("조회를 완료하였습니다.");
    }

    void seat_cancle() {	//예약을 취소하는 메소드
        int seat;
        String name;

        while (true) {
            System.out.print("좌석구분 s<1>, A<2>, B<3>>> ");
            seat = sc.nextInt();	//취소하려는 자리를 입력
            seat_watch(seat);

            System.out.print("이름>> ");
            name = sc.next();	//취소하려는 예약 이름 입력
            
            for (int i = 0; i < 3; i++) {
            	for (int j = 0; j < 10; j++) {
            		if (this.seats[i][j].equals(name)) {
                         this.seats[i][j] = "---";
                         System.out.println("취소되었습니다.");
                         return;
                         }
            		}
            	}
            System.out.println("예약된 이름이 없습니다.");
            }
    }
}
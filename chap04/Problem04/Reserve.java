package Problem04;
import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        Seat st = new Seat();
        Scanner sc = new Scanner(System.in);
        int select;
        while (true) {
            System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4>>> ");
            select = sc.nextInt();
            switch (select) {	//입력된 번호에 따라 다른 메소드 실행
            case 1:
                st.seat_reserve();
                break;
            case 2:
                st.seat_check();
                break;
            case 3:
                st.seat_cancle();
                break;
            case 4:
            	System.out.println("프로그램을 종료합니다.");
            	sc.close();
                return;
            default:
                System.out.println("잘못 입력하셨습니다 (1 ~ 4).");
                continue;
            }
        }
    }
}
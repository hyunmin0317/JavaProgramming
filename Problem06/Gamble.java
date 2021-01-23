package Problem06;
import java.util.Scanner;
// 실습 06-02
public class Gamble {
    public static void main(String[] args) {
    	int i = 0;	// 시행 횟수를 나타내며 게임의 턴을 나타내기 위해 필요함
    	int num1, num2, num3;	// 갬블링 게임 3개의 숫자
        Scanner sc = new Scanner(System.in);
        System.out.println("갬블링 게임");
        System.out.print("1p 입력: ");
        String p1 = sc.nextLine();	// 1p의 이름 입력
        System.out.print("2p 입력: ");
        String p2 = sc.nextLine();	// 2p의 이름 입력
        while(true){
            if(i%2 == 0)	// 시행 횟수가 짝수이면 p1의 차례
                System.out.println("p1: "+p1+" 차례");
            else	// 시행 횟수가 홀수이면 p2의 차례
                System.out.println("p2: "+p2+" 차례");
            System.out.print("<Enter> 키 입력");
            if(sc.nextLine().equals("")) {	// enter를 입력 시
                num1 = (int)Math.round(Math.random()*3); // 0부터 3까지의 임의의 수 num1 생성
                num2 = (int)Math.round(Math.random()*3); // 0부터 3까지의 임의의 수 num2 생성
                num3 = (int)Math.round(Math.random()*3); // 0부터 3까지의 임의의 수 num3 생성
                System.out.println(num1+" "+num2+" "+num3);
                if(num1 == num2 && num2 == num3) {	// 3개의 숫자가 모두 같을때
                    if(i%2 == 0)
                        System.out.println("p1: "+p1+" Win");
                    else
                        System.out.println("p2: "+p2+" Win");
                    break;
                }
                i++;
            }
            
        }
        sc.close();
    }
}
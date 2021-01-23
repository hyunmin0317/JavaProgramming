package FinalExam;
import java.util.Scanner;

public class Gambling {
    public static void main(String[] args) {
    	int i;
    	Scanner sc = new Scanner(System.in);
    	Person[] A = new Person[4];
        
    	for(i=0;i<4;i++) {
    		System.out.print("플레이어 "+(i+1)+"의 이름을 입력하세요: ");
    		A[i] = new Person(sc.nextLine());
    	}
    	
        while(true){
        	for(i=0;i<4;i++) {
        		System.out.print("<Enter> 키 입력");
        		if(sc.nextLine().equals("")) {
                	if(A[i].gamble()) {
                		System.out.println(A[i].name+ " 승리");
                		System.out.println("게임 끝");
                		sc.close();
                		return;
                	}
        		}
        	}
        }
    }
}
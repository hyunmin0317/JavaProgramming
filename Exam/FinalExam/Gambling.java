package Exam.FinalExam;
import java.util.Scanner;

public class Gambling {
    public static void main(String[] args) {
    	int i;
    	Scanner sc = new Scanner(System.in);
    	Person[] A = new Person[4];
        
    	for(i=0;i<4;i++) {
    		System.out.print("�÷��̾� "+(i+1)+"�� �̸��� �Է��ϼ���: ");
    		A[i] = new Person(sc.nextLine());
    	}
    	
        while(true){
        	for(i=0;i<4;i++) {
        		System.out.print("<Enter> Ű �Է�");
        		if(sc.nextLine().equals("")) {
                	if(A[i].gamble()) {
                		System.out.println(A[i].name+ " �¸�");
                		System.out.println("���� ��");
                		sc.close();
                		return;
                	}
        		}
        	}
        }
    }
}
package Problem05;
import java.util.Scanner;
// 실습 05-02
class DObject {
    public void draw() {
    	System.out.println("DObject");
    }
}
 
class Line extends DObject {	// 슈퍼클래스 DObject를 상속받아 서브클래스 Line을 생성
    public void draw() {
        System.out.println("Line");
    }
}
 
class Rect extends DObject {	// 슈퍼클래스 DObject를 상속받아 서브클래스 Rect을 생성
    public void draw() {
        System.out.println("Rect");
    }
}
 
class Circle extends DObject {	// 슈퍼클래스 DObject를 상속받아 서브클래스 Circle을 생성
    public void draw() {
        System.out.println("Circle");
    }
}

public class Graphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DObject dObjects[] = new DObject[100];
        int count = 0;
        int select, add, delete;
        while (true) {
        	System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            select = sc.nextInt();
            switch (select) {
            case 1:	//삽입
                System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>> ");
                add = sc.nextInt();
                if (add == 1) {	// 1번 선택시 Line 생성
                    dObjects[count] = new Line();
                    count++;
                } else if (add == 2) {	// 2번 선택시 Rect 생성
                    dObjects[count] = new Rect();
                    count++;
                } else if (add == 3) {	// 3번 선택시 Circle 생성
                    dObjects[count] = new Circle();
                    count++;
                } else {	// 범위 밖의 수 선택
                    System.out.println("Select 1~3");
                }
                break;
            case 2:	// 삭제
                if (count != 0) {
                    System.out.print("삭제할 도형의 위치>>");
                    delete = sc.nextInt();
                    if (delete <= count) {	// 삭제할 인덱스가 범위 안일때
                        for (int i = delete - 1; i < count; i++) {	// 삭제할 인덱스로 한칸씩 이동
                            dObjects[i] = dObjects[i + 1];
                        }
                        count--;
                    } 
                    else {	// 삭제할 인덱스가 범위 밖일때
                        System.out.println("삭제할 수 없습니다.");
                    }
                } 
                else {	// 저장된 도형이 없을때
                    System.out.println("삭제할 도형이 없습니다.");
                }
                break;
            case 3:	// 모두 보기
                if (count != 0) {	// 저장된 도형이 있을때
                    for (int i = 0; i < count; i++) {	// 저장된 모든 도형을 출력
                        dObjects[i].draw();
                    }
                } 
                else {	// 저장된 도형이 없을때
                    System.out.println("출력할 도형이 없습니다.");
                }
                break; 
            case 4:	// 종료
                System.out.println("프로그램을 종료합니다.");
                sc.close();
                return;
            default:	// 범위 밖 숫자를 입력했을때
                System.out.println("잘못 입력하셨습니다 (1 ~ 4).");
                continue;
            }
        }
    }
}
package Problem05;
// 실습 05-01
class Cpoint{
   int a, b;
   String s;
   public Cpoint(int a, int b) {	// 생성자 생성
      this.a = a;
      this.b = b;
      s="";
   }
   void show() {	// 메소드 생성
      System.out.println("("+a+","+b+")"+" "+ s);
      }
    public String toString() {	// 객체를 문자열로 반환하는 메소드
       return "("+a+","+b+")"+" "+"입니다";
    }
}
public class CColorPoint extends Cpoint {	// 슈퍼클래스 CPoint를 상속받아 서브클래스 CColorPoint 생성
   public CColorPoint(int a, int b, String s) {
      super(a,b);	// 슈퍼 클래스의 생성자 호출
      this.s = s;
   }
   public static void main(String[] args) {
      Cpoint a,b;
      a = new Cpoint(2,3);
      b = new CColorPoint(3,4,"red");
      a.show();
      b.show();
      System.out.println(a);
      System.out.println(b);
   }
}
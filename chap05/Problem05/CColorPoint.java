package chap05.Problem05;
// �ǽ� 05-01
class Cpoint{
   int a, b;
   String s;
   public Cpoint(int a, int b) {	// ������ ����
      this.a = a;
      this.b = b;
      s="";
   }
   void show() {	// �޼ҵ� ����
      System.out.println("("+a+","+b+")"+" "+ s);
      }
    public String toString() {	// ��ü�� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
       return "("+a+","+b+")"+" "+"�Դϴ�";
    }
}
public class CColorPoint extends Cpoint {	// ����Ŭ���� CPoint�� ��ӹ޾� ����Ŭ���� CColorPoint ����
   public CColorPoint(int a, int b, String s) {
      super(a,b);	// ���� Ŭ������ ������ ȣ��
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
package chap06.Problem06;
import java.util.StringTokenizer;
//�ǽ� 06-04
public class query {
  public static void main(String[] args) {
      String query = args[0];	// ����â cmd���� ���� ù��° ���ڿ��� query�� ����
      StringTokenizer t = new StringTokenizer(query, "&=");	// &�� =�� �������� ��ū �и�
      int n = t.countTokens();	// ��ū�� ����
      for(int i=0;i<n;i++){	// ��� ��ū�� ���
          if(i%2==0)
        	  System.out.print(t.nextToken()+"\t");
          else
              System.out.println(t.nextToken());
      }
  }
}
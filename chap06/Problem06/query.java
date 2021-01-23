package Problem06;
import java.util.StringTokenizer;
//실습 06-04
public class query {
  public static void main(String[] args) {
      String query = args[0];	// 명령창 cmd에서 받은 첫번째 문자열을 query에 저장
      StringTokenizer t = new StringTokenizer(query, "&=");	// &와 =를 기준으로 토큰 분리
      int n = t.countTokens();	// 토큰의 개수
      for(int i=0;i<n;i++){	// 모든 토큰을 출력
          if(i%2==0)
        	  System.out.print(t.nextToken()+"\t");
          else
              System.out.println(t.nextToken());
      }
  }
}
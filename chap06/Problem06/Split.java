package Problem06;
import java.io.*;
import java.util.StringTokenizer;
 
public class Split {
    public static void main(String[] args) {
    	StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스트링 버퍼
        InputStreamReader rd = new InputStreamReader(System.in);
        try { // 키보드로부터 문자열을 읽어 스트링 버퍼에 저장함
        	while (true) {
                    int c = rd.read(); // ctrl-z가 입력되면 -1을 반환함
                    if (c == -1)
                        break;
                    sb.append((char) c); // 읽은 문자를 스트링 버퍼에 추가함
                }
            } 
            catch (IOException e) {
                System.out.println("입력 에러 발생");
                }
            StringTokenizer st = new StringTokenizer(sb.toString(), " "); // StringBuffer를 String으로 바꾼 후 Tokenizer를 이용해 분리
            System.out.println("단어의 개수: "+st.countTokens()); // Token 개수 출력
    }
}